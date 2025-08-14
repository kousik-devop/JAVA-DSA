package Backtraking;

public class BacktrackInArray {

    public static void printBacktrack(int arr[], int i, int value){
        if(i == arr.length){
            printArray(arr);
            return;
        }

        arr[i] = value;
        printBacktrack(arr, i + 1, value + 1);
        arr[i] = value - 2;
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int arr[] = new int[5];

        printBacktrack(arr, 0, 1);
        printArray(arr);
    }
}
