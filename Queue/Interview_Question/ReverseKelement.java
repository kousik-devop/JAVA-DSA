package Queue.Interview_Question;

import java.util.*;

public class ReverseKelement {

    public static void reverse(Queue<Integer> q,int k){
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        while(q.size() != 0){
            st1.push(q.remove());
        }
        while(st1.size() !=0){
            if(st1.size()>k){
                st2.push(st1.pop());
            }
            else{
                q.add(st1.pop());
            }
        }
        while(st2.size() != 0){
            q.add(st2.pop());
        }

        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q,3);
    }
    
}
