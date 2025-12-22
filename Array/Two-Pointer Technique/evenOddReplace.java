public class evenOddReplace {

    public static void stableEvenOdd(int[] arr) {
        int n = arr.length;
        int pos = 0; // next position for even number

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                int even = arr[i];
                // Shift elements right to make space for even number
                int j = i;
                while (j > pos) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[pos] = even;
                pos++;
            }
        }
    }

    public static void replaceEvenOdd(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < right) {
            while(left < right && arr[left] % 2 == 0) {
                left++;
            }
            while(left < right && arr[right] % 2 != 0) {
                right--;
            }
            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        // replaceEvenOdd(arr);
        stableEvenOdd(arr);    // With stable order (Not Used Two Pointer Approach)
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
