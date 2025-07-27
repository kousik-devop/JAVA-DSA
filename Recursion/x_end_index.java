package Recursion;

public class x_end_index {

    public static void moveAllx(int idx,String str,int count,String newString){
        char currchar= str.charAt(idx);

        if(idx == str.length()-1){
            for(int i = 0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(currchar == 'x'){
            count++;
            moveAllx(idx+1, str, count, newString);
        }
        else{
            newString += currchar;
            moveAllx(idx+1, str, count, newString);
        }
    }
    public static void main(String[] args) {

        String str = "axbxcxdx";

        moveAllx(0, str, 0, "");
        
    }
    
}
