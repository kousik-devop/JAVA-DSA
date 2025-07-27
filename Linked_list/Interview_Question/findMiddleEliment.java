package Linked_list.Interview_Question;

//import Linked_list.Interview_Question.linklistDSA.linklist;
import Linked_list.Interview_Question.linklistDSA.Node;

public class findMiddleEliment {
    public static void display(Node head){
        Node temp = head;
        if(temp == null){
            System.out.println();
            return;
        }
        System.out.print(temp.data + " ");
        display(head.next);
    }
    public static Node middleIndex(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void DeleteMiddle(Node head){
        Node slow = head;
        Node fast = head;

        if(head.next == null){
            head.data = 0;
            return;
        }

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        //Node b = new Node(2);
        //Node c = new Node(12);
        //Node d = new Node(1);

        //a.next = b;
        //b.next = c;
        //c.next = d;

        display(a);

        Node middle = middleIndex(a);
        System.out.println(middle.data);

        DeleteMiddle(a);
        display(a);



    }
    
}
