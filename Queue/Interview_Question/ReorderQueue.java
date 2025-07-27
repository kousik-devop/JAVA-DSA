package Queue.Interview_Question;

import java.util.*;

public class ReorderQueue {
    public static void reorderQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int n = q.size()/2;

        for(int i =1;i<=n;i++){
            st.push(q.remove());
        }
        while(st.size() != 0){
            q.add(st.pop());
        }

        for(int i = 1;i<=n;i++){
            st.push(q.remove());
        }

        while(st.size() != 0){
            q.add(st.pop());
            q.add(q.remove());
        }

        while(q.size() != 0){
            st.push(q.remove());
        }
        while(st.size() != 0){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q);

        reorderQueue(q);

        System.out.println(q);
    }
    
}
