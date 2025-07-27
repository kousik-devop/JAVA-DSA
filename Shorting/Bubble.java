package Shorting;

import java.util.Scanner;

public class Bubble{

    // Function for print array 

    public static void printArray(int arr[]){
        for(int i=0;i <= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Function for swap 

    public static void swap(int j,int arr[]){
         if(arr[j]>arr[j+1]){
                    // sawap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
         }
         else return;
                
    }


    public static void main(String[] args) {

        int arr[] = {1,8,2,4};

        int a = arr.length;
        boolean sawap;

        // Time complexcity = O(n^2)
        //Bubble Short in Asemblic order 

        for(int i=0;i<a-1;i++){
            sawap = false;
            for(int j=0;j<a-i-1;j++){
                // sawap
                swap(j, arr);
                sawap = true;
            }
            if(sawap == false) break;
        }
        
        // call printArray function

        printArray(arr);
    }
}