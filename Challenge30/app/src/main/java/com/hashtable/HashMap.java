package com.hashtable;

import java.util.ArrayList;
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

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;

        System.out.println("The index of => " + key + " is => " + arrayIndex);

        return arrayIndex;
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

    public boolean contatins(K key) throws Exception {
        int index = hash(key);
        int hashCodeVar = hashCode(key );
        HashNode<K , V > headNode = bucketArray.get(index);

        if (key  != null)
            throw new Exception("null key");

        while (headNode != null){

            if (headNode.getKey().equals(key) && headNode.getHashCode().equals(hashCodeVar))
                return true;
        }
      return false ;
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

    public int hash( K key){

        int hashCodeVar = hashCode(key);
        int index = hashCodeVar % buckets;
        index =index< 0 ?index-1:index;

        return index;
    }
}
