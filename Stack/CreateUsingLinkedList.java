package Stack;

public class CreateUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek(){
            System.out.println(head.data);
            return head.data;
        }

        int pop(){
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        void displayRec(Node head){
            Node temp = head;
            if(temp == null){
                System.out.println();
                return;
            }
            displayRec(temp.next);
            System.out.print(temp.data +" ");
        }

        void display(){
            displayRec(head);
        }
        void displayRev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);

        st.peek();

        st.display();
    }
    
}
