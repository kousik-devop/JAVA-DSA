public class recursionProblems {

    // Tiling Problem

    public static int tilingProblem(int n){
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }

        // Work
        return tilingProblem(n-1) + tilingProblem(n-2);
    }


    // Frainds Pairing Problem 

    public static int friendspair(int n){
        // Base Case
        if(n == 1 || n == 2){
            return n;
        }

        // work

        return friendspair(n-1) + (n-1)*friendspair(n-2);
    }

    public static void main(String[] args) {
        // System.out.println(tilingProblem(5));
        System.out.println(friendspair(4));

    }
}
