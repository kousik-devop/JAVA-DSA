package Shorting;

public class Quick {

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int st,int pi){
        int temp = arr[st];
        arr[st] = arr[pi];
        arr[pi] = temp;
    }

    public static int pertition(int[] arr,int st,int end){
        int p = arr[st];
        int count = 0;

        for(int i=st+1;i<=end;i++){
            if(arr[i] <= p){
                count++;
            }
        }
        int pi = st + count;
        swap(arr, st, pi);

        int i = st;
        int j = end;

        while(i<pi && j>pi){
            while(arr[i] <= p) i++;
            while(arr[j] > pi) j--;

            if(i<pi && j>pi){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pi;

    }
    public static void quickSort(int[] arr,int st,int end){
        if(st >= end) return;

        int pi = pertition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int arr[] = {4,2,9,1,2};

        quickSort(arr, 0, arr.length-1);

        printArr(arr);


    }
    
}
