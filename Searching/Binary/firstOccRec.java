package Searching.Binary;

public class firstOccRec {
    static int firstOccurence(int arr[],int st,int end,int x,int f){
        if(st>end) return f;

        int mid = st + (end-st)/2;

        if(x==arr[mid]){
            return firstOccurence(arr, st, mid-1, x,mid);
        }
        else if(x>arr[mid]){
            return firstOccurence(arr, mid+1, end,x, f);
        }
        else{
            return firstOccurence(arr, st, mid-1, x,f);
        }
              
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3};
        int x = 2;

        int f = firstOccurence(arr, 0, arr.length-1, x, -1);
        System.out.println(f);
    }
    
}
