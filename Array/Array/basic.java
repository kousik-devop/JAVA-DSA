package Array.Array;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY : ");
    int n = sc.nextInt();

    int arr[] =new int[n];

    System.out.println("Enter the elements of the array : ");

    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
    }


    }
}
