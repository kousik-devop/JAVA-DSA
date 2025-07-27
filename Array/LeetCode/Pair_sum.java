package Array.LeetCode;

public class Pair_sum {
    public static int[] findPair(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int[] ans = new int[2];

        while (left < right) {
            int pairSum = arr[left] + arr[right];
            if (pairSum == target) {
                ans[0] = arr[left];
                ans[1] = arr[right];
                return ans;
            }else if (pairSum > target) {
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,8,9,12,15};
        int n = arr.length;
        int target = 20;

        int[] ans = findPair(arr, target);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }

    }

}
