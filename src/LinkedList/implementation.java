package LinkedList;

public class implementation {

    public static class Node{
        int data ;
        Node next;
        Node(int data ){
            this.data= data;
        }
    }
    public static class LinkedList{
        Node head= null;
        Node tail = null;

        public void InsertAtHead(int val){
            Node temp= new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next= head;
                head= temp;
            }
        }

        public void InsertAtEnd(int val) {
            Node temp = new Node (val);
            if(head == null){
                head = temp;

            }else{
                tail.next= temp;
            }
            tail= temp;
        }
        void display(){
            Node temp= head;
            while(temp !=null){
                System.out.println(temp.data);
                temp= temp.next;
            }
        }
        void InsertAt(int idx, int val){
            Node t= new Node(val);
            Node temp = head;
//            if(idx == 6){
//                InsertAtEnd(5);
//            }
            for(int i =0; i <= idx-1 ; i ++){
                temp = temp.next;

            }
            t.next= temp.next;
            temp.next=t;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertAtEnd(4);
        ll.InsertAtEnd(5);
        ll.InsertAtEnd(56);
        ll.InsertAtEnd(34);
        ll.InsertAtEnd(78);
        ll.InsertAtHead(6);

        ll.display();
        ll.InsertAt(2,10);
        ll.display();
    }
}
