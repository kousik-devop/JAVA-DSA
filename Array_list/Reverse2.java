package Array_list;
import java.util.ArrayList;
import java.util.Collections;

public class Reverse2 {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    list.add(4);
    list.add(2);
    list.add(3);

    Collections.reverse(list);

    System.out.println(list);

    Collections.sort(list);
    System.out.println(list);

    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);

    }
}
