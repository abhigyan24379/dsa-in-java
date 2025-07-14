package Basics;

public class method_Call {
    public  int fib(int n){
        if(n==0 || n==1)
            return n ;
        return fib(n-1)+fib(n-2);
    }
//if the above function was declared using static keyword
// i would have used it without initializing the object

    public static void main(String[] args) {
        method_Call m = new method_Call();
        for(int i = 0; i < 23 ; i++)
            System.out.println(m.fib(i)+ " ");
    }

}
