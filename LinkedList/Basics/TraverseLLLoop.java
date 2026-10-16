
public class TraverseLLLoop{
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
        }
    }

    public static void traverse(Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
    public static void main(String args[]){

        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        traverse(a);
    }
}