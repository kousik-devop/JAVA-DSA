package Array.Array;

public class pair_sum {

    static void pairSum2(int arr[],int x){
        int i = 0;
        int j = arr.length-1;

        while (i>j) {
            int pairSum = arr[i]+arr[j];
            if (x>pairSum) {
                i++;
            }else if (x<pairSum){
                j--;
            }else{
                System.out.println(arr[i]+"("+i+") + "+arr[j]+"("+j+") = "+x);
            }
        }
    }

    static void pairSum(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i]+"("+i+") + "+arr[j]+"("+j+") = "+x);
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {2,7,9,15};

        int x =16;

        pairSum2(arr, x);
        
    }
    
}
