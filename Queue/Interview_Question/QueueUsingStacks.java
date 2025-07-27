package Queue.Interview_Question;

import java.util.Stack;

public class QueueUsingStacks {

    public static class queue{
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        void add(int val){
            st1.add(val);
        }

        int remove(){
            while(st1.size()>1){
                st2.push(st1.pop());
            }
            int x = st1.pop();

            while(st2.size() != 0){
                st1.push(st2.pop());
            }
            return x ;
        }

        int peek(){
            for(int i =0;i<st1.size();i++){
                st2.push(st1.pop());
            }
            int x = st1.peek();
            st2.push(st1.pop());

             while(st2.size() != 0){
                st1.push(st2.pop());
            }
            return x ;
        }

        void display(){
            System.out.println(st1);
        }
    }
    public static void main(String[] args) {
        queue q = new queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.display();

        q.remove();
        q.display();

        System.out.println(q.peek());
    }
    
}
