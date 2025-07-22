package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]= {1,3,0,5,8,5};
        int end[]= {2,4,6,7,9,9};

        // what if the given data would be in unsorted form
        int activity[][] = new int[start.length][3];
        for(int i =0; i < start.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];

        }
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();
        count = 1;
        ans.add(0);
        int lastend = end[0];
        for(int i=1; i < end.length; i++){
            if(start[i] >= lastend){
                count++;
                ans.add(i);
                lastend= end[i];
            }
        }
        System.out.println("Max activity : "+  count);

        for (Integer an : ans) {
            System.out.print("A" + an + " ");
        }

    }
}
