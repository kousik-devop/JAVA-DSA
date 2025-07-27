package Shorting;
import java.util.*;

public class Selection_short {
    public static void main(String[] args) {
        
    
    int arr[] = {4,1,7,5,2};

    // Time complexity = O(n^2)
    // Selection Short 

    int a = arr.length-1;

    for(int i=0; i<a; i++){
        int smallest = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[smallest]>arr[j]){
                smallest = j;
            }
        }

        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
    
    for(int i=0; i<a;i++){
        System.out.print(arr[i]+" ");
    }
}
}
