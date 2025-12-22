public class sortSquare {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while(left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-15, -4, -1, 0, 3, 10};
        int[] sortedSquares = sortedSquares(arr);
        for (int num : sortedSquares) {
            System.out.print(num + " ");
        }
    }
}
