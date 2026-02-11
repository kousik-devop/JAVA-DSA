package Queue.Queue_implement;

class Queue{
    int arr[];
    int start= -1;
    int end = -1;
    int currSize = 0;

    Queue(int size){
        arr = new int[size];
    }

    public void push(int data){
        if(currSize == arr.length){
            System.out.println("Queue is full");
            return;
        } else if(currSize == 0){
            start = 0;
            end = 0;
        } else{
            end = (end + 1) % arr.length;
        }

        arr[end] = data;
        currSize++;
    }

    public int pop(){
        int poppedElement = -1;

        if(currSize == 0){
            System.out.println("Queue is empty");
            return -1;
        } else if(currSize == 1){
            poppedElement = arr[start];
            start = -1;
            end = -1;
        } else{
            poppedElement = arr[start];
            start = (start + 1) % arr.length;
        }

        currSize--;
        return poppedElement;
    }

    public int peek(){
        if(currSize == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    public boolean isEmpty(){
        return currSize == 0;
    }

    public boolean isFull(){
        return currSize == arr.length;
    }

    public int size(){
        return currSize;
    }
}

public class qImp {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());
        System.out.println("Queue is empty: " + q.isEmpty());
        System.out.println("Queue is full: " + q.isFull());
        System.out.println("Popped element is: " + q.pop());
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());
        System.out.println("Queue is empty: " + q.isEmpty());
        System.out.println("Queue is full: " + q.isFull()); 
    }
}
