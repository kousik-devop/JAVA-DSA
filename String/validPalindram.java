package String;

public class validPalindram {

    public static boolean isPalindram(String str){
        int left = 0; int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindram(str));
    }
}
