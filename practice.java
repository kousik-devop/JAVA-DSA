import java.util.Scanner;


public class practice {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {4,6,8,1,7};

        int x = 1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                System.out.println("Element x is Found on index : " + i);
                break;
            } 
        }
    }
}