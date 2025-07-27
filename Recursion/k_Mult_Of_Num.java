package Recursion;

public class k_Mult_Of_Num {
    public static void main(String[] args) {
        multiplication(2, 3);
        
    }

    static void multiplication(int n,int k){
        if(k == 0){
            return;
        }

        multiplication(n, k-1);
        System.out.print(n*k + ",");
    }
    
}
