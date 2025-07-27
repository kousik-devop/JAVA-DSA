/**
 * 01_twoSum
 */
public class twoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,5,8};
        int target = 12;
        int idx[] = new int[2];

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] +arr[j] == target){
                    idx[0]=i;
                    idx[1]=j;
                }
            }
        }
        for (int i =0;i<idx.length;i++){
            System.out.print(" "+idx[i]);
        }
    }
}