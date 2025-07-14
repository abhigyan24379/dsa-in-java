package Queue_DS;

public class CircularQueue {
    /*
    rear = (rear+1)% size is a very important case
    (rear+1)%size = front means full
     */

    static class Queue{
        static int arr[];
        static int size;
        static int rare= -1;
        static int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rare ==-1 && front == -1;
        }
        public static boolean full(){
            return (rare+1) % size == front;
        }

        //enqueue
        public static void add(int data ){
            if(full()){
                System.out.println("full queue");
                return;
            }
            if(front == -1){
                front =0;
            }
            rare = (rare + 1) % size;
            arr[rare] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];
            if(rare == front){
                rare = front = -1;
            }else {
                front = (front + 1) % size ;
            }

            return result;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];

        }

    }

    public static void main(String[] args) {
        Queue_Basic.Queue q= new Queue_Basic.Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(4);
        System.out.println(q.remove());
        q.add(9);
        System.out.println(q.remove());
        q.add(5);
        //1 2 3

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
