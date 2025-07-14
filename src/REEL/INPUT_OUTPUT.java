package REEL;

import java.sql.SQLOutput;
import java.util.Scanner;

public class INPUT_OUTPUT {
    /*
    1) In JAVA we use Scanner class to take input from the user
    2) And we use System.out.print to print the output
    3) First we will import the Scanner class by import java.util.Scanner;
    4) we will create object in the function
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("using this function we print ");
        System.out.println("ENTER THE VALUE OF INT A AND STRING STR");
        int a = sc.nextInt();
        String str= sc.nextLine();

        System.out.println("a= "+ a + " str="+ str);
        // we use nextLine() because it will store the values even after space
        // and so on
    }


}
