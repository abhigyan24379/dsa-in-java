package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        for(int i =list.size()-1 ; i>=0; i--){
//            System.out.println(list.get(i)  + "");
//        }

        int max = Integer.MIN_VALUE;
        for ( int i = 0 ; i < list.size(); i++  ){
            max = Math.max(max, list.get(i));
        }
       // System.out.println("Max is : " + max);

        // Swapping two number in the given idx

        int idx1 =1, idx = 3;
        int temp = list.get(idx1);
        list.set(1,list.get(idx));
        list.set(3, temp);
        //System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Collections.reverseOrder());
        System.out.println(list);






    }



}
