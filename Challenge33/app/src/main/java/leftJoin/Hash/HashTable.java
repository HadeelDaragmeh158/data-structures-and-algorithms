package leftJoin.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashTable <K,V>{
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        buckets = 10;
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void set(K key, V value) {
        int index = hash(key);
        int hashcode = hashCode(key);


        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);

        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
        }
        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }
    public boolean contains(K key) {
        int index = hash(key);
        int hashcode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);
        if (key == null) {
            throw new IllegalArgumentException("error");
        }
        while(head != null) {
            if (head.getKey().equals(key) && head.getHashCode().equals(hashcode))
                return true;
            head = head.getNext();
        }
        return false;
    }
    public V get(K key) {
        int index = hash(key);
        int hashcode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode().equals(hashcode))
                return head.getValue();
            head = head.getNext();
        }
        return null;
    }



    int hash(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;
        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;
        return arrayIndex;
    }


    public ArrayList<K> keys() {
        ArrayList<K> arrOfKeys = new ArrayList<>();
        for (int i = 0; i < bucketArray.size(); i++) {
            HashNode<K, V> head = bucketArray.get(i);
            while(head != null){
                arrOfKeys.add(head.getKey());
                head = head.getNext();
            }
        }
        return arrOfKeys;
    }




    public String repeatedWord(String str){
        String replaceComma = str.replace(",","");
        String[] arr = replaceComma.split(" ");
        Map<String,Integer> listOfWords =new HashMap<>();
        for (String string : arr){
            Integer count = listOfWords.get(string.toLowerCase());
            if(count != null){
                listOfWords.put(string.toLowerCase(), count +1);
                return string.toLowerCase();
            }else {
                listOfWords.put(string.toLowerCase(), 0);
            }
        }
        return "No repeated Words";
    }

}
