package Queue;

public class ArrayImplementation {
    public static class queueA{
        int arr[] = new int[100];
        int r = -1;
        int f = -1;
        int size = 0;

        void add(int val){
            if(f == -1) {
                f = r = 0;
                arr[r] = val;
            }
            else{
                arr[r+1] = val;
                r++;
            }
            size++;
        }

        void remove(){
            f++;
            size--;
        }

        int peek(){
            return arr[f];
        }

        void display(){
            for(int i = f;i<size;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();

        q.add(7);
        q.add(4);
        q.add(9);

        q.display();

        System.out.println(q.size);

        q.remove();

        q.display();

        System.out.println(q.peek());
    }
    
}
