import java.util.*;

public class Container_with_most_wt{

    public static int mostWater(int arr[]){
        int n = arr.length-1;
        int lp = 0;
        int rp = n;
        int ans = 0;
        while (lp<rp) {
            int w = rp-lp;
            int h = Math.min(arr[lp],arr[rp]);
            int area = h*w;
            ans = Math.max(area, ans);

            if (arr[lp] < arr[rp]) {
                lp++;
            }else{
                rp--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,4,6,9};
        System.out.println("Max Water contain : "+ mostWater(arr));
    }
}