package Linked_list.Interview_Question;

public class NthNodeFromEnd {
    public static void print(Node head){
        
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linklist{
        Node head;
        Node tail;

        void add(int val){
            Node temp = new Node(val);

            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        Node fromEnd(int n){
            Node slow = head;
            Node fast = head;

            for(int i = 1;i<=n;i++){
                fast = fast.next;
            }

            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        void deleteNthNodeFromEnd(int n){
            Node slow = head;
            Node fast = head;

            for(int i = 1;i<=n;i++){
                fast = fast.next;
            }

            if(fast == null){
                head = head.next;
                return;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }

        Node splitOddEven(Node head){
                Node temp = head;
                Node odd = new Node(-1);
                Node even = new Node(0);
                Node tempOdd = odd;
                Node tempEven = even;
        
                while(temp != null){
                    if(temp.data % 2 != 0){
                        tempOdd.next = temp;
                        tempOdd = temp;
                        temp = temp.next;
                    }
                    else{
                        tempEven.next = temp;
                        tempEven = temp;
                        temp = temp.next;
                    }
        
                }
                tempOdd.next = even.next;
                tempEven.next = null;
        
                return odd.next;
        }
    }
    public static void main(String[] args) {
        linklist x = new linklist();

        x.add(4);
        x.add(7);
        x.add(1);
        x.add(3);
        x.add(8);

        //x.display();

        //Node fromEnd = x.fromEnd(2);
        //System.out.println(fromEnd.data);

        //x.deleteNthNodeFromEnd(4);
        //x.display();

        //x.splitOddEven();

        print(x.head);
        x.display();

        Node a = x.splitOddEven(x.head);

        print(a);


        
    }
    
}
