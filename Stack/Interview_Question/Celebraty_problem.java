package Stack.Interview_Question;

import java.util.Stack;

public class Celebraty_problem {

    public static int Celebrety(int arr[][],int n){
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<n;i++){
            st.push(i);
        }

        while(st.size() > 1){
            int v1 = st.pop();
            int v2 = st.pop();

            if(arr[v1][v2] == 0) { // v1 cleb ho sakta hai , v2
                st.push(v1);
            }
            else if(arr[v2][v1] == 0) st.push(v2);
        }

        if(st.size() == 0) return -1;
        int p = st.pop();
        if
    }
    public static void main(String[] args) {
        
    }
    
}
