package Array.Array;

public class Rotate {
    static void rotate(int arr[],int k){
        int n=arr.length;
        int arr2[] = new int[n];
        int j=0;

        if(k>n){
            k = k%n;    //For beter time complexity.
        }
        else if (k<0){
            k=0;
            System.out.println("Sorry");
        }

        for(int i=n-k;i<n;i++){
            arr2[j++] = arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr2[j++]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        int k=7;

        rotate(arr,k);
        
    }
    
}
