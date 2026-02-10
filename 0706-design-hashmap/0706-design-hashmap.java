import java.util.LinkedList;

class MyHashMap {

    // A simple Pair class to hold our Key and Value
    class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // The main storage: An array where each slot holds a LinkedList of Pairs
    private LinkedList<Pair>[] buckets;
    private static final int SIZE = 2069; // A prime number reduces collisions

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    // Helper to find the bucket index
    private int getBucketIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getBucketIndex(key);
        LinkedList<Pair> bucket = buckets[index];

        // Check if key already exists in this bucket
        for (Pair pair : bucket) {
            if (pair.key == key) {
                pair.value = value; // Update existing value
                return;             // Important: Return immediately so we don't add duplicate
            }
        }

        // If key not found, add a new pair
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
        
        return -1; // Not found
    }
    
    public void remove(int key) {
        int index = getBucketIndex(key);
        LinkedList<Pair> bucket = buckets[index];

        for (Pair pair : bucket) {
            if (pair.key == key) {
                bucket.remove(pair); // Safe to remove here because we return immediately
                return; 
            }
        }
    }
}