package com.hashtable;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;


public class HashMap <K, V>{
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        buckets = 10;

        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }

    public int getSize() {

        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(K key) {

        return Objects.hashCode(key);
    }







    public void set(K key, V value) {

        int index = hash(key);
        int hash = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);
        HashNode<K, V> newNode = new HashNode<>(key, value, hash);

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

    public V get(K key) {
        int index = hash(key);
        int hash = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode().equals(hash))
                return head.getValue();
            head = head.getNext();
        }
        return null;
    }

    public boolean contains(K key) {
        int index = hash(key);
        int  hash = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);
        if (key == null) {
            throw new IllegalArgumentException("error occured !");
        }
        while(head != null) {
            if (head.getKey().equals(key) && head.getHashCode().equals(hash))
                return true;
            head = head.getNext();
        }
        return false;
    }

    public ArrayList<K> keys (){
        ArrayList<K> keysList = new ArrayList<>();

        for(int index=0 ; index < bucketArray.size(); index++){
            HashNode< K , V > headNode = bucketArray.get(index);

            while (headNode != null){
                keysList.add(headNode.getKey());
                headNode = headNode.getNext();
            }
        }

        return keysList;
    }

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % buckets;

        index = index < 0 ? index * -1 : index;

        System.out.println( "[" + key + "  => " + index + "]") ;

        return index;
    }

    public int hash( K key){

        int hashCodeVar = hashCode(key);
        int index = hashCodeVar % buckets;
        index =index< 0 ?index-1:index;

        return index;
    }


    public String repeatedWord(String str){
        String replaceComma = str.replace(",","");
        String[] arr = replaceComma.split(" ");
        Map<String,Integer> wordsList = (Map<String, Integer>) new HashMap<String,Integer>();
        for (String subStr : arr){
            Integer count = wordsList.get(subStr.toLowerCase());
            if(count != null){
                wordsList.put(subStr.toLowerCase(), count +1);
                return subStr.toLowerCase();
            }else {
                wordsList.put(subStr.toLowerCase(), 0);
            }
        }
        return "no result ";
    }

}
