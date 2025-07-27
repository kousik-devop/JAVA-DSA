package HashMap;

import java.util.LinkedList;

public class CreateAHashMap {

    public static class MyHashMap<K,V> {
        public static final int Default_length = 4;
        public static final float Load_Factor = 0.75f;

        private class Node{
            K key;
            V value;

            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }


        public static int n;
        public  LinkedList<Node>[] bucket;

        private void fillIndex(int N){
            bucket = new LinkedList[N];

            for(int i = 0;i<bucket.length;i++){
                bucket[i]= new LinkedList<>();
            }

        }

        public MyHashMap(){
            fillIndex(Default_length);
        }

        private int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % bucket.length;
        }

        private int searchInBucket(LinkedList<Node> currBucket,K key){
            for(int i = 0;i<currBucket.size();i++){
                Node currNode = currBucket.get(i);
                if(currNode.key == key){
                    return i;
                }
            }
            return -1;
        }

        private void reHash(){
            LinkedList<Node>[] oldBucket = bucket;
            fillIndex(oldBucket.length*2);
            n = 0;
            for(var bucket : oldBucket){
                for(var Node : bucket){
                    put(Node.key, Node.value);
                }
            }
        }

        public int size(){
            return n;
        }

        public void put(K key,V value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBucket(currBucket,key);

            if(ei == -1){
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }
            else{
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if(n>= bucket.length*Load_Factor){
                reHash();
            }

        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei != -1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            else{
                return null;
            }
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei==-1){
                return null;
            }
            else{
                Node currNode = currBucket.get(ei);
                currBucket.remove(ei);
                n--;

                return currNode.value;
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String,Integer> mp = new MyHashMap<>();

        mp.put("A",1);
        mp.put("B",2);
        mp.put("C",3);
        mp.put("D",4);

        System.out.println(mp.size());
        mp.put("A",70);
        System.out.println(mp.get("A"));
        System.out.println(mp.size());

        System.out.println(mp.remove("B"));

        System.out.println(mp.get("B"));
        System.out.println(mp.size());
    }
    
}
