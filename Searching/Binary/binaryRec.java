package Searching.Binary;

public class binaryRec {
    static boolean rec(int arr[],int st,int end,int x){
        if(st>end) return false;
        int mid = st + (end-st)/2;

        if(x==arr[mid]){
            return true;
        }
        else if(x>arr[mid]){
            return rec(arr, mid+1, end, x);
        }
        else{
            return rec(arr, st, mid-1, x);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,8};
        int x=1;

        System.out.println(rec(arr, 0, arr.length-1, x));
    }
    
}
