package Recursion;
import java.util.Scanner;

public class Factorial {

    public static void factorial(int i,int n,int fact){

        if(i==n+1 || n==0){
            System.out.println(fact);
          return;
        }

        fact = fact*i;
        factorial(i+1,n,fact);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        factorial(1, n, 1);
        }
    
}
