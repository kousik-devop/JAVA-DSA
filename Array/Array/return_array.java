package Array.Array;
import java.util.Arrays;
import java.util.Scanner;

public class return_array {

    static int[] smallLarge(int arr[]){
        Arrays.sort(arr);

        int ans[]={arr[0],arr[arr.length-1]};

        return ans;
    }

   public static void main(String[] args) {
    
    int arr[]={4,5,7,1};

    int ans[] = smallLarge(arr);

   
    System.out.print("Smallest = " + ans[0]);
    System.out.println("\nLargest = " + ans[ans.length-1]);
    
   }
    
}
