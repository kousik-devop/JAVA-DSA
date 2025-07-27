package Stack.Interview_Question;

import java.util.*;

public class Balanced_brackets {
    public static boolean balancedBrackets(String str){
        int n = str.length();

        Stack<Character> st = new Stack<>();

        for(int i = 0;i<= n-1;i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else{
                if(st.size() == 0) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(balancedBrackets(str));
        
    }
}
