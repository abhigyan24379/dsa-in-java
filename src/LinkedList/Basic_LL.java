package LinkedList;

public class Basic_LL {
    public static void displayrev(Node head){
        if(head== null){
            return;
        }
        displayrev(head.next);
        System.out.println(head.data+" ");
    }

    public static void  displayr(Node head){
        if(head== null){
            return ;
        }
        System.out.println(head.data);
        displayr(head.next);
    }
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data= data;

        }
    }



    public static void main(String[] args) {
//        Node X = new Node();
//        System.out.println(X.next);
        Node a= new Node(5);
        Node b= new Node(3);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
// 5-> 3-> 9-> 8 -> 16
        a.next=b;
        b.next= c;
        c.next=d;
        d.next=e;
       // System.out.println(a.next.data);
        //System.out.println(a.next.next.data);
        Node temp = a;
//        for(int i =0; i < 5;i ++){
//            System.out.println(temp.data+" ");
//            temp= temp.next;
//        }
//
        displayr(a);
        displayrev(a);
    }
}
