package HashMap.Question;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        int n = arr.length;
        int ans[] = {-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            int partner = target-arr[i];
            if(mp.containsKey(partner)){
                int a[] = new int[]{mp.get(partner),i};
                return a;
            }
            else{
                mp.put(arr[i],i);
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,8,7,1,6};

        int ans[] = twoSum(arr, 10);

        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
    
}
