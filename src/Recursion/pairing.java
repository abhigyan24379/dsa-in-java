package Recursion;

public class pairing {
    public static int friends(int n ){
        if(n == 1 || n ==2){
            return n;
        }
        int fn1 = friends(n-1);
        int fn2 = friends(n-2);
        int pairway = (n-1) * fn2;

        int totalways = fn1 + pairway;

        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(friends(5));
    }


}
