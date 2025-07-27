package Array.Array;

public class triplet_sum {

    static void pairSum(int arr[],int x){

        int count = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(arr[i] + arr[j] + arr[k] == x){
                    System.out.println("INDEX ("+i+" + "+j+" + "+k+") = "+x);
                    count ++;
                }
            }
            }
        }
        System.out.println("Found : "+count+" Triplets");
    }
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,1,1};

        int x =5;

        pairSum(arr, x);
        
    }
    
}

