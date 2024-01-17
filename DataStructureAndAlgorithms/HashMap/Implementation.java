package DataStructureAndAlgorithms.HashMap;

import java.util.*;

public class Implementation {

    public static class MyHashMap<K, V> {


        private static final int defaultCapacity = 4;
        private static final float loadFactor = 0.75f;
        int size = 0;

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Node>[] buckets;

        public void initialiseBuckets(int N){
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }
        public MyHashMap(){
            initialiseBuckets(defaultCapacity);

        }

        private int HashFunction(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInbucket(LinkedList<Node> LL, K key){
            for (int i = 0; i < LL.size(); i++){
                if (LL.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehashing(){
            LinkedList<Node> [] oldBucket = buckets;
            initialiseBuckets(oldBucket.length*2);
            size = 0;
            for (var bucket : oldBucket){
                for (var node : bucket){
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key, V value){
            int bucketIndex = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int ei = searchInbucket(currBucket, key);
            if (ei == -1){ // key does not exist hence add a new key
                Node temp = new Node(key, value);
                buckets[bucketIndex].add(temp);
                size++;
            }
            else{
                currBucket.get(ei).value = value;
            }

            if (size >= buckets.length * loadFactor){
                rehashing();
            }
        }

        public boolean contains(K key){
            int bucketIndex = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int ei = searchInbucket(currBucket, key);
            if (ei != -1) return true;
            return false;
        }

        public V get(K key){
            int bucketIndex = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int ei = searchInbucket(currBucket, key);
            if (ei != -1){ // value exist karti hai
                Node currentNode = currBucket.get(ei);
                return currentNode.value;
            }
            return null;
        }

        public int capacity(){
            return buckets.length;
        }

        public float load(){
            return (size*1.0f)/buckets.length;
        }

        public V remove(K key){
            int bucketIndex = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int ei = searchInbucket(currBucket, key);
            if (ei != -1){ // value hai isey remove kro
                Node currentNode = currBucket.get(ei);
                currBucket.remove(ei);
                size--;
                return currentNode.value;
            }
            return null;
        }

        public int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("amir",10);
        map.put("adil",15);
        map.put("amma",20);
        map.put("a",500);
        map.put("b",5000);
        map.put("c",78);
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("amma"));
        System.out.println(map.size());
        System.out.println(map.capacity());
        System.out.println(map.load());
        System.out.println(map.contains("amifr"));
    }
}