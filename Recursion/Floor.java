package Recursion;

public class Floor {
    public static int floor(int n,int m){

        if(m==n){
            return 2;
        }
        if(n<m){
            return 1;
        }

        // Vertically 
        int v = floor(n-m, m);

        // Horizental
        int h = floor(n-1, m);

        return v + h;
    }
    public static void main(String[] args) {

        int n = 2;
        int m = 5;

        System.out.println(floor(n, m));
        
    }
    
}
