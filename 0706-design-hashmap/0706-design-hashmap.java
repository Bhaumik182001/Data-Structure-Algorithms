import java.util.LinkedList;

class MyHashMap {

    class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

 
    private LinkedList<Pair>[] buckets;
    private static final int SIZE = 2069; 

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    private int getBucketIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getBucketIndex(key);
        LinkedList<Pair> bucket = buckets[index];

        for (Pair pair : bucket) {
            if (pair.key == key) {
                pair.value = value; 
                return;            
            }
        }

     
        bucket.add(new Pair(key, value));
    }
    
    public int get(int key) {
        int index = getBucketIndex(key);
        LinkedList<Pair> bucket = buckets[index];

        for (Pair pair : bucket) {
            if (pair.key == key) {
                return pair.value;
            }
        }
        
        return -1; 
    }
    
    public void remove(int key) {
        int index = getBucketIndex(key);
        LinkedList<Pair> bucket = buckets[index];

        for (Pair pair : bucket) {
            if (pair.key == key) {
                bucket.remove(pair); 
                return; 
            }
        }
    }
}