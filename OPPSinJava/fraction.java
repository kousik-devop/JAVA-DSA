package OPPSinJava;

public class fraction {
          // Add two Fraction
    public static Fraction add(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.dem + f2.num*f1.dem;
        int denominator = f1.dem*f2.dem;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static Fraction mul(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.dem*f2.dem;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static int gcd(int num,int dem){
        int min = Math.min(num, dem);
        for(int i = min;i>0;i--){
            if(num%i == 0  && dem%i == 0){
                return i;
            }
        }
        return min;
    }

    public static class Fraction{       // Create a Class
        int num;
        int dem;

        public Fraction(){     // Error not occur.

        }
        public Fraction(int num,int dem){   // CONSTRACTOR 
            this.num = num;               
            this.dem = dem;
        }
        public void simplify(){
            int hcf = gcd(num,dem);
            num = num/hcf;
            dem = dem/hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,2);     //  Create Object
        System.out.println(f1.num +"/"+ f1.dem);

        Fraction f2 = new Fraction(4, 2);

        Fraction f3 = add(f1,f2);
        System.out.println(f3.num +"/"+ f3.dem);

        Fraction f4 = mul(f1,f2);
        System.out.println(f4.num +"/"+ f4.dem);
    }
    
}
