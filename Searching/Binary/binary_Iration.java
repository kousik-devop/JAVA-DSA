package Searching.Binary;

public class binary_Iration {
    static boolean binarySearch(int arr[],int x){
        int st = 0;int end = arr.length-1;
        
        while(st <= end){
            int mid = (end + st)/2;
            if(arr[mid] == x){
                return true;
            }
            else if(arr[mid]>x){
                end = mid-1;
            }
            else{
               st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};  // process only for sorted array
        int x = 2;

        System.out.println(binarySearch(arr, x));

    }
    
}
