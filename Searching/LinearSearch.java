package Searching;
import java.util.*;

public class LinearSearch {
    public static boolean Ls(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the searching Element : ");
        int x = sc.nextInt();

        for(int i =0;i<arr.length;i++){
            if(arr[i] == x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,3,7,9};

        boolean ls = Ls(arr);
        System.out.println(ls);

    }
    
}
