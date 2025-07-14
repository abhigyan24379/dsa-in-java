package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class map1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        /*
        precompute
        Map stores the data in a sorted manner
        it takes time logN time
        */

        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int i =0 ; i < n ; i ++){
            //getOrDefault(key, value) it returns the count if the number
            // exists otherwise it returns 0
            mpp.put(arr[i] , mpp.getOrDefault(arr[i], 0)+1);
        }

        System.out.println("enter the iteration ");
        int q = sc.nextInt();
        while(q-- > 0){
            int number = sc.nextInt();
            System.out.println(mpp.getOrDefault(number,0));
        }
    }


}
