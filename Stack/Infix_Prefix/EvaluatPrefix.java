package Stack.Infix_Prefix;

import java.util.Stack;

public class EvaluatPrefix {
    public static int Evaluat(String str){
        Stack<Integer> val = new Stack<>();

        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57) val.push(ascii-48);

            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }

        return val.peek();
    }
    public static void main(String[] args) {

        String str = "-9/*+5346";

        System.out.println(Evaluat(str));
        
    }
    
}
