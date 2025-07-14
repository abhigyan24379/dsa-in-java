package LinkedList;

public class self {
    public static class Node{
        int data ;
        Node next;
        Node ( int data ){
            this.data = data;
            this.next= null;
        }
        void insertAtHead(Node head ,int data1){
            Node temp = new Node(data1) ;
            temp.next = head;
            head = temp;

        }
        void Print(Node head){
            Node temp = head;
            while(temp !=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        Node n= new Node(10);
//        System.out.println(n.data );
//        System.out.println(n.next);
        Node head = n;
        n.insertAtHead(head, 30);
        n.Print(head);

    }
}
