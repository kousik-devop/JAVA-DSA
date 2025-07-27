package Recursion;

public class PowerRecusion {
    public static void main(String args[]){
        System.out.println(pow(3, 3));
    }

    static int pow(int p,int q){
        //Base case 
        if(q == 0){
            return 1;
        }
        
        //smallWork
        int smallWork = pow(p, q/2);
        if(q%2 == 0){
            
            return smallWork * smallWork;
        }
            
            return smallWork * smallWork * p;
    }
    
}
