package Array.LeetCode;

import java.util.Scanner;

public class Second_largest {
    int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = new Second_largest().secondLargest(arr);

        System.out.println("Second largest element is : " + ans);

    }
}
