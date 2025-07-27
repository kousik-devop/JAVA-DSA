package Array.d_arr;
import java.util.*;

public class input {

    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Print Array : ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter Row of the array : ");
        int r = sc.nextInt();
        System.out.print("Enter Col of the array : ");
        int c =sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i=0;i<r;i++){
            System.out.println("Enter "+i+"th index array : ");
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);

    }
    
}
