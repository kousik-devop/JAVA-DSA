
import java.util.*;

public class practice{
    public static void main(String[] args){
        int arr[] = {3,7,2,9};

        for(int i = 0; i < arr.length; i++){
            int minPosition = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }

            // Swap

            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}