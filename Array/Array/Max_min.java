package Array.Array;
import java.util.*;

public class Max_min {

    public static void max_min(int arr[],int n){
        int max = arr[0];
        int min = max;
        for(int i=0;i<n;i++){
            if(arr[i]>min){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum number int the array : " + max);
        System.out.println("Minimum number int the array : " + min);
    }
    public static void main(String[] args) {
        int n=2;

        int arr[] = {4,5};

       max_min(arr, n);

        
    }
}
