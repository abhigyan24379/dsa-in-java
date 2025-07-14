import java.util.HashMap;

public class IBM_Question {
    public static void main(String[] args) {
        int[] server_id = {1, 3 , 4, 2,5};
        int[] start_id ={1 , 2 , 4};
        int [] end_id = {5, 4 , 5 };
        int left =0;
        int right = 5;

        HashMap<Integer, Integer> mpp  = new HashMap<>();
        for(int i =0 ; i < 5 ; i++){
           mpp.put(server_id[i], right );
           right--;
        }
        int sum =0 ;
        for (int i = 0; i < 5; i++) {
            if (mpp.containsKey(i + 1)) {
                if (mpp.get(server_id[i]) > i + 1) {
                    sum += 2;
                } else if (mpp.get(i + 1) < i + 1) {
                    sum += 1;
                }
            }
        }
            System.out.println(sum);

    }
}
 