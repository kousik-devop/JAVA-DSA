package HashMap.Question;

import java.util.HashMap;
import java.util.Scanner;         // Each Char of two String are same 
                                         // Time Complexity : O(n)
public class ValidAnagram {

    public static HashMap<Character,Integer> creatHashMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }
            else{
                int freq = mp.get(ch);
                mp.put(ch, freq+1);
            }
        }
        return mp;
    }

    public static Boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> mp1 = creatHashMap(s);
        HashMap<Character,Integer> mp2 = creatHashMap(t);

        return mp1.equals(mp2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two String : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isAnagram(s1, s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagramm");
        }
    }
    
}
