package Linked_list.Interview_Question;

public class linklistDSA {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public  class linklist{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtEnd(int value){
            Node temp = new Node(value);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtBegan(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insert(int idx,int val){
            Node value = new Node(val);
            Node temp = head;

            if(idx == size+1){
                insertAtEnd(val);
                return;
            }
            else if(idx == 0){
                insertAtBegan(val);
                return;
            }
            
            for(int i = 1;i<=idx-1;i++){
                temp = temp.next;
            }
            value.next = temp.next;
            temp.next = value;
    
            size++;
        }

        public int get(int idx){
            Node temp = head;

            for(int i = 1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        public void delete(int idx){
            Node temp = head;

            if(idx == 0){
                head = temp.next;

            }

            for(int i = 1;i<=idx-1;i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

        public void set(int idx,int val){
            Node temp = head;
            for(int i = 1;i<=idx;i++){
                temp = temp.next;
            }
            temp.data = val;
        }

    public static void main(String[] args) {
        
    }
}
}
