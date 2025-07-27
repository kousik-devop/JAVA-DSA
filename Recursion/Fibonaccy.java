package Recursion;
import java.util.*;

public class Fibonaccy {

    public static void printFib(int a,int b,int n){

        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");

        printFib(b, c, n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your nth term of number : ");
        int n = sc.nextInt();

        int a = 0,b=1;

         System.out.println("\nFibonaccy series : ");

        System.out.print(a+" ");
        System.out.print(b+" ");
        
       
        printFib(a, b, n);
        System.out.println("\n");

    }
    
}
