package Syntax;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        System.out.printf("Name: %s, Age: %d\n", "Abhi" , 25);

        Scanner sc = new Scanner(System.in);

//        String Name = sc.nextLine();
//        int age = sc.nextInt();
//        double salary = sc.nextDouble();
//        char gender = sc.next().charAt(0);
//
//        System.out.println("Name" + Name + " Age "+ age + " Salary "+ salary);
//        sc.close();

        int[] arr = new int [5];
        int []arr2 = {1,2,3,4,5};

        String s = "Hello World";

        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(("Substring : " + s.substring(0,5)));
        System.out.println("Lower case: "+ s.toLowerCase());
        System.out.println(("Upper Case : "+ s.toUpperCase()));
        System.out.println("Index of word : "+ s.indexOf("World"));
        System.out.println("Equals function : "+  s.equals("hello world"));
        System.out.println("Equal Ignore case: "+  s.equalsIgnoreCase("hello world"));
        System.out.println("COntains function  : "+ s.contains("Hello"));
        System.out.println("Replace : " + s.replace("World", "Java"));






    }
}
