package Linked_list;

public class lengthOfLinklist {

    public static void size(Node head){
        int count = 0;
        if(head == null){
            System.out.println(count);
            return;
        }
        size(head.next);
        count ++;
        
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(6);
        Node c = new Node(2);
        Node d = new Node(9);
        Node e = new Node(65);
        // 4 6 2 9 65
        // Link all 

        a.next = b;   // 4 -> 6 2 9 65   
        b.next = c;   // 4 -> 6 -> 2 9 65
        c.next = d;   // 4 -> 6 -> 2 -> 9 65
        d.next = e;   // 4 -> 6 -> 2 -> 9 -> 65 [null]

        size(a);

    }
    
}
