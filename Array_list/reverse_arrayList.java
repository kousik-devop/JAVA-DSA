package Array_list;
import java.util.ArrayList;
import java.util.*;

public class reverse_arrayList {
    static void reverseList(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while(i<j){
            int temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println("After reverse : ");
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> L = new ArrayList<>();

        System.out.println("Enter Elements : ");

        for(int i=0;i<=4;i++){
            L.add(i,sc.nextInt());
        }

        System.out.println("Your Array_list is : "+ L);

        reverseList(L);
    }
    
}
