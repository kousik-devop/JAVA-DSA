package Stack.Implement_using_arr;

class Stack {

    int arr[];
    int top = -1;
    
    Stack(int size){
        arr = new int[size];
    }
    
    public void push(int data){
        if(top == arr.length -1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int popedElement = arr[top];
        top--;
        return popedElement;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == arr.length -1;
    }

    public int size(){
        return top + 1;
    }
}

public class stackImp {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("Top element is: " + st.peek());
        System.out.println("Stack size is: " + st.size());
        System.out.println("Stack is empty: " + st.isEmpty());
        System.out.println("Stack is full: " + st.isFull());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Top element is: " + st.peek());
        System.out.println("Stack size is: " + st.size());
        System.out.println("Stack is empty: " + st.isEmpty());
        System.out.println("Stack is full: " + st.isFull());
    }
}
