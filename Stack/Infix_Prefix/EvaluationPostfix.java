package Stack.Infix_Prefix;

import java.util.Stack;

public class EvaluationPostfix {

    public static int Evaluat(String str){
        Stack<Integer> val = new Stack<>();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57) val.push(ascii-48);

            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }

        return val.peek();
    }
    public static void main(String[] args) {
        String str = "95-34*6/+";

        System.out.println(Evaluat(str));
    }
    
}
