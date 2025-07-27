package Recursion;

public class armstrong {
    public static void main(String[] args) {
        int x = 153;

        int temp = arm(x);
        System.out.println(temp);
        if(temp == x){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }

    static int arm(int x){
        int temp = 0;
        if(x < 10){
            temp = temp + x*x*;
            return temp;
        }
        x = x/10;
        return arm(x%10);
        
    }
    
}
