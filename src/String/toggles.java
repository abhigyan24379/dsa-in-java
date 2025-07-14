package String;

import java.util.Scanner;

public class toggles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        //toggle
        // PHysiCs  --> phYSIcs
        for(int i =0; i < str.length(); i++){
             boolean flag = true;
             char ch = str.charAt(i);
             int asci = (int)ch;
             if(asci>=97)
                 flag = false;
             if(flag == true){
                 asci+=32;
                 char dh = (char)asci;
                 str.setCharAt(i,dh);
             }else{
                 asci-=32;
                 char dh =(char)asci;
                 str.setCharAt(i,dh);
             }
        }
        System.out.println(str);
    }
}
