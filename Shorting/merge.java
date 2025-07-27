package Shorting;

public class merge {
    public static void merge(int arr[],int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];
        int i,j,k;
        for(i = 0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(j = 0;j<n2;j++){
            right[j] = arr[mid+1+j];
        }

        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[i]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }
    static void mergrSort(int arr[],int l,int r){
        
        if(l<r){
           
        
        int mid = (l+r)/2;

        mergrSort(arr, l, mid);
        mergrSort(arr, mid+1, r);
        merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,8,1,-5,-3};

        int r = arr.length - 1;

        mergrSort(arr, 0, r);
       
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
