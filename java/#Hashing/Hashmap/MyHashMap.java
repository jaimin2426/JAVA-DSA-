import java.util.LinkedList;

public class MyHashMap<K, V> {

    // Node class
    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int n; // number of nodes
    private int N; // number of buckets
    private LinkedList<Node>[] buckets;

    // Constructor
    @SuppressWarnings("unchecked")
    public MyHashMap() {
        this.N = 4;
        this.buckets = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hashFunction(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % N;
    }

    // Search key in bucket
    private int searchInBucket(K key, int bucketIndex) {
        LinkedList<Node> ll = buckets[bucketIndex];

        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // Rehashing
    @SuppressWarnings("unchecked")
    private void rehash() {
        LinkedList<Node>[] oldBuckets = buckets;
        N = N * 2;
        buckets = new LinkedList[N];

        for (int i = 0; i < N; i++) {
            buckets[i] = new LinkedList<>();
        }

        n = 0;
        for (LinkedList<Node> ll : oldBuckets) {
            for (Node node : ll) {
                put(node.key, node.value);
            }
        }
    }

    // Put operation
    public void put(K key, V value) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInBucket(key, bucketIndex);

        if (dataIndex == -1) {
            buckets[bucketIndex].add(new Node(key, value));
            n++;
        } else {
            Node node = buckets[bucketIndex].get(dataIndex);
            node.value = value;
        }

        double lambda = (double) n / N;
        if (lambda > 0.75) {
            rehash();
        }
    }

    // Get operation
    public V get(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInBucket(key, bucketIndex);

        if (dataIndex == -1) {
            return null;
        } else {
            return buckets[bucketIndex].get(dataIndex).value;
        }
    }

    // Remove operation
    public V remove(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInBucket(key, bucketIndex);

        if (dataIndex == -1) {
            return null;
        } else {
            Node node = buckets[bucketIndex].remove(dataIndex);
            n--;
            return node.value;
        }
    }

    // Check if key exists
    public boolean containsKey(K key) {
        int bucketIndex = hashFunction(key);
        return searchInBucket(key, bucketIndex) != -1;
    }

    // Size
    public int size() {
        return n;
    }

    // Display HashMap
    public void display() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + " : ");
            for (Node node : buckets[i]) {
                System.out.print("(" + node.key + "," + node.value + ") ");
            }
            System.out.println();
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("India", 140);
        map.put("USA", 330);
        map.put("China", 1440);
        map.put("UK", 67);

        System.out.println("India -> " + map.get("India"));
        System.out.println("USA -> " + map.get("USA"));

        map.remove("UK");

        System.out.println("Contains China? " + map.containsKey("China"));
        System.out.println("Size: " + map.size());

        System.out.println("\nHashMap Structure:");
        map.display();
    }
}
