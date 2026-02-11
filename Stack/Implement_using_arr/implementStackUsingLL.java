package Stack.Implement_using_arr;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;
    int size = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }
}

public class implementStackUsingLL {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element is: " + st.peek());
        System.out.println("Stack size is: " + st.getSize());

        System.out.println("Popped element is: " + st.pop());
        System.out.println("Top element after pop is: " + st.peek());
        System.out.println("Stack size after pop is: " + st.getSize());
        System.out.println("Stack is empty: " + st.isEmpty());
    }
}
