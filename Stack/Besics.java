package Stack;

import java.util.Stack;

public class Besics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(7);
        st.push(9);

        System.out.println(st);

        st.pop();

        System.out.println(st);

        int x = st.peek();
        System.out.println(x);
    }
}
