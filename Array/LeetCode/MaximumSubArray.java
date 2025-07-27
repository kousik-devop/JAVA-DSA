package Array.LeetCode;

public class MaximumSubArray {
    public static int maxSubArraySum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int num : nums){
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

    }
    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum : " + maxSubArraySum(arr));
    }
}
