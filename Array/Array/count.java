package Array.Array;

public class count {
    public static void main(String[] args) {

        int arr[] = {4,5,7,4};
        int x = 5,count=0;

        for(int j=0;j<arr.length;j++){                     // O(n)
            if(arr[j]==x){
                count++; 
            }
        }
        System.out.println( x + " is found " + count + " times.");
    }
    
}
