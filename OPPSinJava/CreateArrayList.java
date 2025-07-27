package OPPSinJava;

import java.util.Arrays;

public class CreateArrayList {
    public static class arraylist{
        int arr[] = new int[2];
        int idx = 0;
        int size = 0;

        public void add(int x){
            if(arr.length == size){
                int brr[] = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
            }
            arr[idx] = x;
            idx ++;
            size ++;
        }

        public void print(){
            System.out.print("[ ");
            for(int i = 0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("]");
        }
    } 
    public static void main(String[] args) {

        arraylist arr = new arraylist();

        arr.add(2);
        System.out.println(arr.size);
        arr.add(4);
        arr.add(7);

        arr.print();
        
    }
    
}
