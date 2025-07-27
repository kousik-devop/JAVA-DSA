package HashMap.Question;

import java.util.HashMap;

public class LargestSubArray {
    public static int subArray(int [] arr){
        int n = arr.length;
        int sLength = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i<n;i++){
            prefixSum = prefixSum + arr[i];
            if(!mp.containsKey(prefixSum)){
                mp.put(prefixSum,i);
            }
            else{
                sLength = Math.max(sLength, i-mp.get(prefixSum));
            }
        }

        return sLength;
    }
    public static void main(String[] args) {
        int arr[] = {4,7,1,2,-2};
        System.out.println(subArray(arr));
    }
    
    
}
