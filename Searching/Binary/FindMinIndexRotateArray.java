package Searching.Binary;

public class FindMinIndexRotateArray {

    static int findMinIndex(int[] arr) {
        int st = 0, end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            // Minimum is in right half
            if (arr[mid] > arr[end]) {
                st = mid + 1;
            }
            // Minimum is in left half (including mid)
            else {
                end = mid;
            }
        }
        return st; // index of minimum element
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,0,1};

        int idx = findMinIndex(arr);
        System.out.println("Min index = " + idx);
        System.out.println("Min value = " + arr[idx]);
    }
}
