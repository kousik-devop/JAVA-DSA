package Queue;

import java.util.*;

public class printQueue {

    public static void print(Queue<Integer> q ){
        Queue<Integer> temp = new LinkedList<>();

        while(q.size() != 0){
            int top = q.remove();
            System.out.print(top + " ");
            temp.add(top);
        }
        System.out.println();

        while(temp.size() != 0){
            q.add(temp.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(7);
        q.add(1);
        q.add(8);
        print(q);
        System.out.println(q);
    }
}
