public class sortZerosAndOnes {
    public static void sortZerosAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer to the right until we find a 1
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Move right pointer to the left until we find a 0
            while (left < right && arr[right] == 1) {
                right--;
            }
            // Swap the elements at left and right pointers
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
        sortZerosAndOnes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
