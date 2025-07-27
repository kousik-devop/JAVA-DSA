package Array.Array;

public class Last_Index {
    public static void main(String[] args) {
        
    
    int arr[] = {5,2,5,4};
    int x=5;

    int lastIndex = -1; // if x not found return -1;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            lastIndex = i;
        }
    }
    System.out.println(lastIndex);
    }
}
