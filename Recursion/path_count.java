package Recursion;

public class path_count {
    public static int pathCount(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }

        // Move Down path count 
        int downPath = pathCount(i+1, j, n, m);

        // Move Right path count
        int rightPath = pathCount(i, j+1, n, m);

        return rightPath + downPath;
    }
    public static void main(String[] args) {

        int n =4;
        int m =4;

        int totalPath = pathCount(0, 0, n, m);
        System.out.println(totalPath);
        
    }
    
}
