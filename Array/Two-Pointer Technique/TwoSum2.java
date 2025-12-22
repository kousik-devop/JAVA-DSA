public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        int ans[] = new int[2];

        while (left < right){
            int pairSum = numbers[left] + numbers[right];

            if(pairSum < target){
                left++;
            } else if(pairSum > target){
                right--;
            }else{
                ans[0] = left + 1;
                ans[1] = right + 1;

                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
