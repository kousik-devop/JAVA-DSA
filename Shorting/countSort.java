package Shorting;

public class countSort {
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void countsort(int arr[]){
        int max = max(arr);
        int count[] = new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0;

        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++] = i;
            }
        }


    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1};

        countsort(arr);

        printArr(arr);

    }
    
}
