package Recursion;

public class gcd {
    public static void main(String[] args) {
        int x = 15,y = 24;

        System.out.println(gcd(x, y));
    }

    static int gcd(int x,int y){
        if(y == 0) return x;

        return gcd(y,x%y);
    }
    
}
