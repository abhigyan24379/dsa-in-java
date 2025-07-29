package Recursion;

public class Sum {
    public static int Nsum(int n ){
        if( n ==1){
            return 1;
        }
        int sum = Nsum(n-1);
        int sm = n + sum;
        return sm;

    }
    public static void main(String[] args) {
        int n  =5 ;
        System.out.println(Nsum(n));
    }
}
