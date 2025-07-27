package NumberSystem;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number.....");
        int decimal = sc.nextInt();

        int binary = 0;
        int pow = 1;

        while(decimal > 0){
            int rem = decimal % 2;
            decimal = decimal/2;

            binary += (rem * pow);
            pow *= 10;
        }

        System.out.println("Binary Form : " + binary);
    }
}
