package ArrayList;

import java.util.ArrayList;

public class multi_dimensional_AL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(3); list2.add(4);

        mainlist.add(list);
        mainlist.add(list2);
        System.out.println(mainlist);
        for(int i = 0 ; i < mainlist.size(); i ++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for( int j =0 ;  j < currlist.size(); j++) {
                System.out.print(currlist.get(j)+ " ");

            }
            System.out.println();
        }
    }
}
