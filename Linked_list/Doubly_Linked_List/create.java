package Linked_list.Doubly_Linked_List;

public class create {
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class DoublyLinkList{
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
                head.prev = null;
                size++;
            }
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                size++;
            }
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insert(int idx,int val){
            Node temp = new Node(val);
            Node t = head;
            if(idx == 0){
                temp.prev = null;
                temp.next = head;
                head.prev = temp;
                head = temp;
                size++;
            }
            else if(idx == size){
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                size++;
            }
            else{
                for(int i = 1;i<idx;i++){
                    t = t.next;
                }
                t.next.prev = temp;
                temp.prev = t;
                temp.next = t.next;
                t.next = temp;
                size++;
            }
        }
        
    }
    public static void main(String[] args) {
        DoublyLinkList x = new DoublyLinkList();
        x.add(8);
        x.add(47);
        x.add(5);
        x.add(71);
        x.display();

        x.insert(3, 46);
        x.display();
    }
    
}
