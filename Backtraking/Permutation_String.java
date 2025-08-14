package Backtraking;

import Array.Array.print;

public class Permutation_String {

    public static void printPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recurssion
        for(int i = 0; i < str.length(); i++){
            printPermutation(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str,"");
    }
}