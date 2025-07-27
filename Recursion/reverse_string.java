package Recursion;

public class reverse_string {

    public static void reverse(String str ,int index){
        if(index==-1){
            return;
        }

        System.out.print((str.charAt(index)) + " ");
        reverse(str, index-1);
    }
    public static void main(String[] args) {

        String str = "ABCD";
        int index = str.length()-1;

        reverse(str, index);
        
    }
    
}
