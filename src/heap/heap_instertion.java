package heap;

import java.util.ArrayList;

public class heap_instertion {

        static class heap{
            ArrayList<Integer> arr = new ArrayList<>();

            public void add(int data){
                // add at last
                arr.add(data);

                int x = arr.size() - 1;
                int par = ( x-1 ) / 2 ;

                while(arr.get(x) < arr.get(par)){
                    //swap;
                    int temp = arr.get(x);
                    arr.set(x, arr.get(par));
                    arr.set(par , temp);
                }
            }
            public int peek(){
                return arr.get(0);
            }

            public int remove(){
                int data = arr.get(0);
                int temp = arr.get(0);
                arr.set(0 , arr.size()-1);
                arr.set(arr.size() -1 ,temp );

                arr.remove(arr.size() - 1);

                heapify(0);
                return data;

            }
            private void heapify(int i ){
                int left = 2*i +1;
                int right = 2*i + 2;
                int index = i ;

                if(left < arr.size() && arr.get(index) > arr.get(left)){
                    index = left;
                }
                if(right < arr.size() && arr.get(index) > arr.get(right)){
                    index = right ;
                }
                if(index != i){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(index));
                    arr.set(arr.size()-1 , temp);
                    heapify(index);
                }
            }

        }



    public static void main(String[] args) {

    }
}
