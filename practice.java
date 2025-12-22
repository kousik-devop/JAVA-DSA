import java.util.Arrays;
import java.util.Scanner;


public class practice {

    public static int unique(int arr[]){
        int ans = 0;
        Arrays.sort(arr);
        for(int i = 1; i< arr.length; i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                ans = arr[i];
                System.out.print(ans + "  ");
            }
        }
        return ans;
    }

    
    public static void main(String[] args) {
       int arr[] = {4,2,2,8,8,3};
       System.out.println(unique(arr));
    }
}