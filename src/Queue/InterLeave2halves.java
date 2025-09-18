package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InterLeave2halves {

    public static void interleaf(Queue<Integer> q){
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = q.size();
        for(int i =0; i < size/2; i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
//        q.add(11);
//        q.add(12);
        interleaf(q);

        while(!q.isEmpty()){
            System.out.print(q.remove());
        }
    }
}
