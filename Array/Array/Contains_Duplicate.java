package Array.Array;

import java.util.Arrays;

public class Contains_Duplicate {
    static boolean containsDuplicate(int arr[]){
        boolean flage = false;

        Arrays.sort(arr);

        int slow = 0;
        int fast = slow+1;

        while(fast<arr.length){
            if(arr[slow]==arr[fast]){           // O(n)
                flage=true;
            }
            slow++;
            fast++;
        }
        return flage;
    }
    public static void main(String[] args) {

        int arr[] = {5,2,5,2};

        boolean flage = containsDuplicate(arr);

        System.out.println(flage);
        
    }
    
}
