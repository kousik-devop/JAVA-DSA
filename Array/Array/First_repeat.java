package Array.Array;

public class First_repeat {

    static int firstValue(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];       // Mathod the end 
                }
                
            }
        }
        return -1;                     // Returns means Exit from current Mathode 
       
    }

    public static void main(String[] args) {

        int arr[] = {1,5,4,5,1};

        int value = firstValue(arr);

        System.out.println(value);
        
    }
    
}
