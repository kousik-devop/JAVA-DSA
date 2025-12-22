
import java.util.*;

public class Insertion {
    public static void main(String[] args){
        int arr[] = {1,8,4,6,2};

        int a = arr.length;

        // Insertion Short

        for(int i=1; i<a; i++){
            int current = arr[i];

            int prev = i-1;

            // Finding the correct position to insert the element

            while(prev>=0 && current < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev+1] = current;
        }

        for(int j=0; j<a; j++){
            System.out.print(arr[j]+" ");
        }

        }
    
}
