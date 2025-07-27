package Array.d_arr;

public class besic {

    static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] arr = new int [2][3];

        int arr2[][] = {{1,2},{1,4,6}};

        print(arr2);

        
    }
    
}
