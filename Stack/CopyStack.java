package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Stack : ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<n;i++){
            int x  = sc.nextInt();
            st.push(x);
        }
        Stack<Integer> gt = new Stack<>();
        Stack<Integer> rt = new Stack<>();

        while(st.size()>0){
            gt.push(st.pop());
        }

        while(gt.size()>0){
            rt.push(gt.pop());
        }

        System.out.println(rt);


    }
    
}
