package Recursion;

public class first_last {
    public static int first = -1;
    public static int last = -1;

    public static void firstlast(String str,char a,int index){

        if(index == str.length()){
            System.out.println("First : "+ first);
            System.out.println("Last : "+ last);
            return;
        }
        char curent = str.charAt(index);
        if(curent == a){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
            firstlast(str, a,index+1);
        
        
    }
    public static void main(String[] args) {

        String str = "chagftai";


        firstlast(str, 'a', 0);
    }
    
}
