package stack1;

public class stack_basic {
    /*
    we can implement satck in 3 for
    1. array - fixed size
        stack full check krna hoga
    2. arraylist - variable size
        double once it is full
    3. linkedlist- variable size
        we will change the head in the linked list as we can only track the head

       peek pop and push is O(n)
     */
    static class node{
        int data ;
         node next;

         public node (int data ){
             this.data = data ;
             next= null;
         }

    }
    static class stack{
        public static node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push (int data ){
            node newnode = new node(data);
            if(isEmpty()){
                head = newnode;
                return ;
            }
            newnode.next = head ;
            head = newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;

        }
    }
    public static void main(String[] args) {
        stack s= new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
