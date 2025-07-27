package Searching.Binary;

public class firstOcc {
    static int firstOccurence(int arr[],int x){
        int st = 0;
        int end = arr.length-1;
        int f=-1;

      while(st<=end){
          int mid = st + (end-st)/2;
        

          if(x==arr[mid]){
            f = mid;
            end = mid-1;
          }
          else if(x>arr[mid]){
            st = mid +1;
          }
          else{
            end = mid-1;
           }
        }
      return f;
              
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3};
        int x = 4;

        int f = firstOccurence(arr, x);
        System.out.println(f);
    }
    
}
