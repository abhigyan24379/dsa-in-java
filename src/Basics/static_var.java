package Basics;//static variable usage

public class static_var {
    public static String A = "Abhigyan Sinha";
    // static variable can be accessed without any object creation
    // static variable can never be declared locally
    public static void main(String[] args) {
        System.out.println("my name is :" + static_var.A);

        //static int B =0 is error
    }
}
