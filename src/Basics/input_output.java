package Basics;

import java.util.Scanner;
public class input_output {
    public static void main(String[] args) {
        System.out.println("working with scanner class");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number");
        int num1 = sc.nextInt();

        System.out.println("enter your second number" );
        int num2 = sc.nextInt();

        System.out.println("sum of two number("+  num1 +"+" + num2+") : is "+(num1+num2));

        //we close the sc class to release the resource;
        sc.close();

    }
}
