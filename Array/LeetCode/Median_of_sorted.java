public class Median_of_sorted {

    public static int[] margeArr(int arr1[],int arr2[]){
        int i = 0,j = 0,k = 0;
        int merged[] = new int[arr1.length + arr2.length];

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]<=arr2[j]) {
                merged[k++] = arr1[i++];
            }else{
                merged[k++] = arr1[j++];
            }
        }

        while (i<arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j<arr2.length) {
            merged[k++] = arr1[j++];
        }

        return merged;
    }
    public static void main(String[] args) {
        int num1[] = {1,2,3};
        int num2[] = {2,7,8};

        int merged[] = margeArr(num1,num2);
        int mid = (merged.length-1)/2;

        if (merged.length % 2 == 0) {
            double median = (merged[mid] + merged[mid+1])/2;
            System.out.print("Median : "+ median);
        }else{
            System.out.print("Median : "+ merged[mid]);
        }
    }
}
