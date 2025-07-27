package Linked_list;

public class CreateAlinklist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linklist{
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

    }
    public static void main(String[] args) {
        linklist x = new linklist();
        x.insertAtEnd(4);
        x.insertAtEnd(85);
        x.display();
        x.insertAtBegan(47);
        x.display();
        System.out.println(x.tail.data);

        x.insert(0, 7);
        x.display();
        System.out.println(x.size);

        int a = x.get(0);
        System.out.println(a);
        x.delete(3);
        x.display();
        x.set(1, 2);

        x.display();
    }
}
