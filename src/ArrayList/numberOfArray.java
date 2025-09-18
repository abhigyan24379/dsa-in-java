package ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class numberOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2 ,3 ,3 ,4 ,1, 4, 5 ,1 ,2};
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i =0; i < arr.length; i++){
            if(mpp.containsKey(arr[i])){
                mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
            }
            else{
                mpp.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> num : mpp.entrySet()){
            System.out.println(num.getKey() + "occured" + num.getValue());
        }
    }
}
