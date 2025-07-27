package Queue.Interview_Question;

import java.util.*;

public class StackUsingQueues {
    public static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        void push(int val){
            q1.add(val);
            
        }

        int peek(){
            for(int i = 1;i<q1.size();i++){
                q1.add(q1.remove());
            }
            int x = q1.peek();
            q1.add(q1.remove());

            return x;
        }

        int remove(){
            for(int i = 1;i<q1.size();i++){
                q1.add(q1.remove());
            }
            int x = q1.peek();
            q1.remove();
            return x;
        }

        void display(){
            for(int i = 0;i<q1.size();i++) {
                System.out.print(q1.peek() + " ");
                q1.add(q1.remove());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();

        st.remove();
        st.display();

        System.out.println(st.peek());
    }
    
}
