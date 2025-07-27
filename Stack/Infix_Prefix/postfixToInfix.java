package Stack.Infix_Prefix;
import java.util.*;

public class postfixToInfix {

    public static String postfixToInfix(String str){
        Stack<String> st = new Stack<>();

        for(int i = 0;i <= str.length()-1;i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57){
                String s = "" + ch;
                st.push(s);
            }

            else{
                String v2 = st.pop();
                String v1 = st.pop();
                char op = ch;

                String t = "(" + v1 + op + v2 + ")";
                st.push(t);
            }
        }

        return st.pop();
    }
    public static void main(String[] args) {
        String str = "95-34*6/+";

        System.out.println(postfixToInfix(str));
    }
    
}
