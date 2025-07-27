package Linked_list.Interview_Question;

public class DeleteDataUsingNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(9);
        Node c = new Node(1);
        Node d = new Node(5);

        a.next = b;   // 4 -> 9 1 5 
        b.next = c;   // 4 -> 9 -> 1 5
        c.next = d;   // 4 -> 9 -> 1 -> 5

        

    }
    
}
