package Recursion;

public class TilesFitting {
    public static int TilesFitting (int n){
        if(n==0 || n==1){
            return 1;
        }

        return TilesFitting(n-1) + TilesFitting(n-2);

        // // Verticaly Fit 
        // int vertical = TilesFitting (n-1);

        // // Horizental Fit 
        // int Horizentel = TilesFitting (n-2);
        
        //  int TotalWays = vertical + Horizentel;

        // return TotalWays;
    }
    public static void main(String[] args) {
        System.out.println(TilesFitting(4));
    }
}
