package Recursion;

import Array.Array.print;

public class permutations {

    static void printPerm(String str,String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);

            printPerm(newString, perm + currchar);
        }
    }
    public static void main(String[] args) {

        String str = "ABC";
        printPerm(str, "");
        
    }
    
}
