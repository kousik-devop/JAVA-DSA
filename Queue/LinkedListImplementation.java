package Queue;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class QueueL{
        Node r = null;
        Node f = null;
        int size = 0;

        void add(int val){
            Node temp = new Node(val);
            if(f == null){
                f = temp;
                r = temp;
            }
            else{
                r.next = temp;
                r = r.next;
            }
            size++;
        }

        void remove(){
            f = f.next;
            size--;
        }
        
        int peek(){
            return f.data;
        }

        int size(){
            return size;
        }

        boolean isempty(){
            if(size == 0) return true;
            else return false;
        }

        void display(){
            Node t = f;
            while(t != null){
                System.out.print(t.data +" ");
                t = t.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueL q = new QueueL();

        System.out.println(q.isempty());
        
        q.add(7);
        q.add(1);
        q.add(5);
        System.out.println(q.size);

        q.display();

        q.remove();

        q.display();

        System.out.println(q.size);

        System.out.println(q.peek());
    }
    
}
