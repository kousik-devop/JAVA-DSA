package Recursion;


public class Number1 {

    public static void printNumber(int n) {
        if (n==6){      // Base case 
            return;
        }
        System.out.print(n+" ");   // print

        printNumber(n+1);    // Recursion

}

    public static void main(String[] args) {
        int a = 1;

        printNumber(a);  // a=5
    }
    
}
