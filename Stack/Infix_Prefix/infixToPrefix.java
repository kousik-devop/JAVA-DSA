package Stack.Infix_Prefix;

import java.util.Stack;

public class infixToPrefix {
    public static String infixtoPrefix(String infix){
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57){  // 0 to 9
                String s = "" + ch;
                st.push(s);
            }
            else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);

            else if(ch == ')'){
                while(op.peek() != '('){
                    String v2 = st.pop();
                    String v1 = st.pop();

                    char o = op.pop();

                    String s = o + v1 + v2;
                    st.push(s);
                }

                op.pop();
            }

            else{
                if(ch == '+' || ch == '-'){
                    String v2 = st.pop();
                    String v1 = st.pop();

                    char o = op.pop();

                    String t = o + v1 + v2;
                    st.push(t);

                    op.push(ch);
                }

                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = st.pop();
                        String v1 = st.pop();

                        char o = op.pop();

                        String t = o + v1 + v2;
                        st.push(t);

                        op.push(ch);
                    }
                    else op.push(ch);
                }
                
            }
        }

        while(st.size()>1){
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();
            String s = o + v1 + v2;
            st.push(s);
        }

        return st.peek();
        
    }
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infixtoPrefix(infix));
    }
    
}
