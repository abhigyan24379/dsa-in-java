package Queue_DS;

public class Queue_Basic {
    /*
    1. in a line (fifo)
    -------------------------
 i/p -|  1 | 2 | 3 | 4
    __________________________
 o/p-| 1| 2 | 3 | 4
    _________________________
    operation
    enqueue = add

    dequeue = remove

    front = peek

     */

    // queue using array
    /*
    1. size = n
    2. front element = arr[0]
    3. remove index last
    4. position of the rear and front is as the -1 position when empty

     */

    static class Queue{
        static int arr[];
        static int size;
        static int rare= -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rare ==-1;
        }

        //enqueue
        public static void add(int data ){
            if(rare == size-1){
                System.out.println("full queue");
            }
            rare++;
            arr[rare] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i =0; i < rare ;i++){
                arr[i] = arr[i+1];
            }
            rare --;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];

        }

    }

    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }





}
