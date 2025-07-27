package Stack.Interview_Question;

import java.util.Stack;

public class Consicutive_subsequences {
    public static int[] remove(int arr[]){
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<arr.length; i++){
            if(st.size() == 0 || st.peek() != arr[i]) st.push(arr[i]);
            if(st.peek() == arr[i]) {
                if(arr[i] != arr[i+1] || i == arr.length){
                    st.pop();
                }
                
            }
        }
        int res[] = new int[st.size()];

        for(int i = res.length;i>0;i--){
            res[i] = st.pop();
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,8,8,8,9,4,4,4,1};

        int res[] = remove(arr);

        for(int i =0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}