package Searching.Binary;

public class find_min_index_RotateArray {
    static int minIndex(int arr[],int st,int end,int idx){
        if(st>end) return idx;
        if(st==end) return idx+1;

        int mid = st + (end-st)/2;
        if(arr[mid]<=arr[end]){
            if(arr[mid]<arr[mid-1]){
            return idx = mid;
            }
            else{
                return minIndex(arr, st, mid-1, mid);
            }
        }
        else{
            return minIndex(arr, mid+1, end, idx);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,9};

        int idx = minIndex(arr, 0, arr.length-1, -1);
        System.out.println(idx);

    }
    
}
