package ArrayList;
import java.util.ArrayList;
public class AL1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);  // adding is big O of 1

//        System.out.println(list);

        int element = list.get(1);
        System.out.println(element); // constant timing

        // remove element O(n)

        list.remove(2);
        list.set(2,10); // index 2 value 10  O(n)
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.contains(11)); // O(n)

    }
}
