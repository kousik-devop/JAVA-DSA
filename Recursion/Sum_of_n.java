package Recursion;
import java.util.*;

public class Sum_of_n {

    public static int printSum(int n){

        if(n == 1){
            return 1;
        }

        return printSum(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n term of number = ");

        int a = sc.nextInt();

        System.out.print("Sum of n natural number = ");

        System.out.print(printSum(a));
    }
}
