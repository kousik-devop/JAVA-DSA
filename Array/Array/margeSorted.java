import java.util.Arrays;

public class margeSorted {
    public static void main(String[] args) {
        int arr1[] = {8,1,10,4};
        int arr2[] = {5,2,3,9};

        int arr3[] = new int[arr1.length + arr2.length];
    
        margeArray(arr1,arr2,arr3);

        int n = arr3.length;

        if (n%2 == 0){
            int mid = n/2;
            float median = (arr3[mid] + arr3[mid-1])/2;
            System.out.println(median);
        }
        else{
            System.out.println(arr3[n/2]);
        }
        
    }

    public static void margeArray(int arr1[],int arr2[],int arr3[]){
        int i=0,j=0,k=0;

        while (i<arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j<arr2.length) {
            arr3[k++] = arr2[j++];
        }

        Arrays.sort(arr3);
    }
}
