package Backtraking;

public class Print_substrings {

    public static void printSubstrings(String str, String ans, int i) {
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        
        // Recurssion
        // Yes
        printSubstrings(str,ans + str.charAt(i), i + 1);
        // No
        printSubstrings(str,ans, i + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubstrings(str,"", 0);
    }
}
