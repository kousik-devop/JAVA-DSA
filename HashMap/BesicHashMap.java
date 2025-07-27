package HashMap;
import java.util.*;
public class BesicHashMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();

        mp.put("Akash" , 22);
        mp.put("Rahul" , 01);
        mp.put("Rohit" , 04);
        mp.put("Kousik" , 27);

        System.out.println(mp.get("Rahul"));
        System.out.println(mp.containsValue("Kousik"));

        System.out.println(mp.keySet());

        System.out.println(mp.values());

        System.out.println(mp.entrySet());
        mp.remove("Akash");

        System.out.println(mp.entrySet());
    }
    
}
