package Array.Array;

import java.util.Arrays;

public class Find_unique_element {

    static void uniqueElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
                
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
            System.out.println(arr[i]);
            }
        }
    }

    static void uniqueElement2(int arr[]){
        Arrays.sort(arr);

        int slow = 0;
        int fast = slow+1;

        while(fast<arr.length){
            if(arr[slow] != arr[fast]){
                if(fast == arr.length-1){
                    System.out.println(arr[fast]);
                }
                else if(arr[slow+1] != arr[fast+1]){
                    System.out.println(arr[fast]);
                }
            }

            slow++;
            fast++;
        }
    }

    static void UE(int arr[]){
        Arrays.sort(arr);

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=arr[i-1] && arr[i] != arr[i+1]){
                System.out.print(i);
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,2,1,3,2,5};

        uniqueElement2(arr);

        UE(arr);
        
    }
    
}
