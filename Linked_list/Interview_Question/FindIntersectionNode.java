package Linked_list.Interview_Question;

public class FindIntersectionNode {
    public static Node intersectionNode(Node head1,Node head2){
        int head1Length = 0;
        int head2Length = 0;
        Node slow,fast;
        Node temp1 = slow = head1;
        Node temp2 = fast = head2;
        while(temp1 != null){
            head1Length ++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            head2Length ++;
            temp2 = temp2.next;
        }
        
        //Node slow = head1;
        //Node fast = head2;

        if(head1Length>head2Length){
            for(int i = 1;i<=head1Length-head2Length;i++){
                slow = slow.next;
            }
        }
        else if(head2Length>head1Length){
            for(int i = 1;i<=head2Length-head1Length;i++){
                fast = fast.next;
            }
        }

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }
    public static void display(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);  // head 1
        Node b = new Node(8);
        Node c = new Node(1);
        Node d = new Node(45);
        Node e = new Node(12);

        Node x = new Node(41);   // head 2
        Node y = new Node(82);
        Node z = new Node(95);
            // 1st list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
            // 2nd list
        x.next = y;
        y.next = z;

        //Intersection
        z.next = c;

        display(a);
        display(x);

        Node interNode = intersectionNode(a,x);
        System.out.println(interNode.data);
    }
    
}
