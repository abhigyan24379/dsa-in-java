package HashMap;

import java.util.Scanner;

public class Hash_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= "aghbc";

        //precompute
        int[] hash = new int[26];
        for(int i = 0; i < s.length() ; i++ ){
            hash[ s.charAt(i) - 'a'] ++;
        }
        System.out.println("enter the iteration ");
        int q = sc.nextInt();
        while(q-- > 0)
        {
            char c = sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
        sc.close();
    }
}
