package Array.Array;


public class Searching_Element {
    public static void main(String[] args) {

    int arr[] = {4,7,8};

    int a,n=0;
    a=8;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==a){
            n=i;
            break;
        }
        else{
            n=-1;
        }
       
    }
     System.out.println(n);
   
}
    
}
