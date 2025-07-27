package HashMap.Question;
import java.util.*;

public class Isomorpic {
    public static boolean isIsomorpic(String s , String t){
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(mp.containsValue(tch)){
                return false;
            }
            if(mp.containsKey(sch)){
                char curr = mp.get(sch);
                if(curr != tch){
                    return false;
                }
            }
            else{
            mp.put(sch, tch);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two String : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isIsomorpic(s1, s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
