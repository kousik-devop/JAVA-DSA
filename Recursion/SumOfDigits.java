package Recursion;
public class SumOfDigits {
    public static void main(String args[]){
        int n = 123;
        System.out.println(sum(n));
    }

      public static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sum(n/10) + n%10;
        
    }
}