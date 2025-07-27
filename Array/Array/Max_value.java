package Array.Array;
import java.util.*;

public class Max_value {
    public static int maxValue(int arr[]){
        int max = Integer.MIN_VALUE; // Min value of integer -2147483647  // Max value 2147483648

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int n = sc.nextInt();

    int arr[]= new int[n];
    System.out.println("Enter the element in the array : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int max = maxValue(arr);

    System.out.println("Maximum number in this array : "+max);

    }
    
}
