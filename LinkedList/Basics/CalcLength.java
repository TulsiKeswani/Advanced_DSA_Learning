
public class CalcLength{
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
        }
    }

    public static int length(Node head){
        int len = 0;

        while(head != null){
            len++;
            head = head.next;
        }

        return len;
    }
    public static void main(String args[]){

        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(2);
        Node f = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(length(a));
    }
}