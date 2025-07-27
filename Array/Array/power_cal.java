package Array.Array;
class power_cal{

    public static double pow(double x,int n){
        double ans = 1;
        long BF = n;

        if(BF<0){
            x = 1/x;
            BF = -BF;
        }

        while (BF > 0) {
            if(BF % 2 == 1){
                ans *= x;
            }
            x *= x;
            BF /= 2;
        }

        return ans;

    }
    public static void main(String[] args) {
        double x = 2;
        int n = -6;
        System.out.println(pow(x,n));
    }
}