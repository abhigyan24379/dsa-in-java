package HashMap;

import java.util.Scanner;


public class Hash_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values of array");
        for(int i = 0; i < n ; i ++) {
            arr[i]= sc.nextInt();
        }
        //precompute
        int[] hash = new int[n];
        for (int i =0; i < n;i++){
            hash[arr[i]] +=1;
        }
        System.out.println("enter  Q");
        int q= sc.nextInt();
        while(q-- > 0){
            System.out.println("enter the value of number you want to see");
            int number = sc.nextInt();
            //fetch
            System.out.println(hash[number]);
        }

    }
}
