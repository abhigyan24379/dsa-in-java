package ArrayList;

import java.util.ArrayList;

/*
###
    For given n lines on x axis use 2 lines to form a container such that it holds maximum water.
    height = [ 1,8,6,2,5,4,8,3,7]
###
 */



public class Container_with_most_water {


    public static int storeWater(ArrayList<Integer>height){
        int maxWater = 0 ;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        list.add(1);

        System.out.println(storeWater(list));




    }

}
