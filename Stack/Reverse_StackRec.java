package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_StackRec {
    public static void putAtBottom(Stack<Integer> st,int val){
        if(st.size() == 0){
            st.push(val);
            return;
        }
        int top = st.pop();
        putAtBottom(st, top);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        putAtBottom(st, top);
        st.push(top);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Stack : ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<n;i++){
            int x  = sc.nextInt();
            st.push(x);
        }

        reverseStack(st);

        System.out.println(st);
    }
    
}
