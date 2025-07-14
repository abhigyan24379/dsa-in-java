package LinkedList;

public class doubly {
    public static class node{
        int val ;
        node next; //null
        node prev; //null
        node(int val){
            this.val = val;

        }
        public static void display(node head){
            node temp = head;
            while(temp != null){
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            //4 10 2 99 13
            node a = new node(4);
            node b = new node(10);
            node c = new node(2);
            node d = new node(99);
            node e = new node(13);
            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = e;
            d.next = e ;
            e.prev = d;
            e.next=null;


        }
    }
}
