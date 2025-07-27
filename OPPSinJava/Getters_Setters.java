package OPPSinJava;

public class Getters_Setters {
    public static class Student{
        String name ;
        private int roll;
        static String collage = "CEMK";     // Static : 

        public int Getroll(){     // Getters : Only print or Get this 
            return roll;
        }

        public void Setroll(int roll){     // Setters : Change this atribute value
            this.roll = roll;
        }
    }
    public static void main(String[] args) {

        Student s1 = new Student();

        //s1.roll;    Does not exist because roll(atribute) is PRIVATE 

        s1.Setroll(56);
        System.out.println(s1.Getroll());

        System.out.println(Student.collage);    // 
        
    }
    
}
