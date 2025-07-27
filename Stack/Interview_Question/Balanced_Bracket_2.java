package Stack.Interview_Question;

import java.util.*;

public class Balanced_Bracket_2 {
    public static String balancedBrackets(String str){
        int n = str.length();
        int ob = 0;
        int cb = 0;

        Stack<Character> st = new Stack<>();

        for(int i = 0;i<= n-1;i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else{
                if(st.size() == 0) str.replace(str.charAt(i),);
                if(st.peek() == '(') st.push(str.charAt(i));
            }
        }
        if(st.size()>0) {
            ob = st.size();
            str.char
        }
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(balancedBrackets(str));
        
    }
    
}
