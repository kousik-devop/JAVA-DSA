package Recursion;


public class Number {

    public static void printNumber(int n) {
        if (n==0){      // Base case 
            return;
        }
        System.out.print(n+" ");   // print

        printNumber(n-1);    // Recursion

}

    public static void main(String[] args) {
        int a = 5;

        printNumber(a);  // a=5
    }
    
}
