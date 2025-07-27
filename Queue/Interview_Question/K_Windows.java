package Queue.Interview_Question;

import java.util.*;

public class K_Windows {
    public static int[] printFirstNegativeInteger(int arr[],int k){
        int n = arr.length;
        int res[] = new int[n-k+1];
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<n;i++){
            if(arr[i] < 0) q.add(i);
        }

        for(int i = 0;i<= n-k+1;i++){
            if(q.size() > 0 && q.peek()<i) q.remove();
            if(q.size() > 0 && q.peek()<= i+k-1){
                res[i] = arr[q.peek()]
            }
            else if(q.size() == 0) res[i] = 0;
            else res[i] = 0;
        }

        return res;
    }
    public static void main(String[] args) {
        
    }
    
}
