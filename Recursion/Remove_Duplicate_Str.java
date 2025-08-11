package Recursion;

public class Remove_Duplicate_Str {


    public static void removeDuplicate(String str, int idx, StringBuilder newString, boolean map[]){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            removeDuplicate(str, idx+1, newString, map);
        } else{
            map[currchar - 'a'] = true;
            removeDuplicate(str, idx+1, newString.append(currchar), map);
        }

    }


    public static void main(String[] args) {
        removeDuplicate("kkousoi", 0, new StringBuilder(""), new boolean[26]);
    }
}
