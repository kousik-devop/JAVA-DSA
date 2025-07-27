package Stack;

public class CreateStackUsingArray {
    public static class Stack{
        private int arr[] = new int[50];
        private int idx = 0;

        void push(int val){
            arr[idx] = val;
            idx++;
        }
        int peek(){
            System.out.println(arr[idx-1]);
            return arr[idx-1];
        }

        int pop(){
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            System.out.print("[");
            for(int i = 0;i<=idx-1;i++){
                System.out.print(arr[i]);
                if(i<idx-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }
        
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push(8);
        st.push(1);

        st.peek();
        st.display();
    }
    
}
