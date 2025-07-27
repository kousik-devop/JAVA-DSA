package Backtraking;

public class Permutation_ofNumber {
    static void printPermutation(int arr[],int idx,String perm){
        if(arr.length == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<arr.length;i++){
            String curr = arr[i];
            perm = curr + arr[i+1];
            printPermutation(arr, idx+1, perm);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        //int perm[] = {};
        printPermutation(arr, 0,"");

    }
    
}
