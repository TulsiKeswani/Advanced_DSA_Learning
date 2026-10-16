
public class DisplayLLRecursion{
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
        }
    }

    public static void display(Node head){
        if(head == null) {
            System.out.println();
            return;
        };
        System.out.print(head.data + " ");
        display(head.next);
    }
    

    
    public static void displayReverse(Node head){
        if(head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
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

        display(a);
        displayReverse(a);
    }
}