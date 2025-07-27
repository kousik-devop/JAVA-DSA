package Stack.Infix_Prefix;

import java.util.Stack;

public class prefixToPostfix {
    public static String prefixToPostfix(String str){
        Stack<String> st = new Stack<>();

        for(int i = str.length()-1;i>= 0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57){
                String s = "" + ch;
                st.push(s);
            }

            else{
                String v1 = st.pop();
                String v2 = st.pop();
                char op = ch;

                String t = v1 + v2 + op;
                st.push(t);
            }
        }

        return st.pop();
    }
    public static void main(String[] args) {
        String str = "-9/*+5346";

        System.out.println(prefixToPostfix(str));
    }
    
}
