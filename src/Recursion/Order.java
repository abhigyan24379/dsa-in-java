package Recursion;

public class Order {
    public static void OrderDec(int n ){
        if( n == 1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        OrderDec(n-1);

    }
    public static void OrderInc(int n ){
        if ( n == 1){
            System.out.println(n);
            return ;
        }
        OrderInc(n-1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        OrderDec(n);
        OrderInc(n);
    }
}
