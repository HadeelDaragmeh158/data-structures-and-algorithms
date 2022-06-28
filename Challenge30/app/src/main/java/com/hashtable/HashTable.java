package com.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HashTable <K, V>{

        private ArrayList<HashNode<K, V>> hashNodes;

        private int numbuckets;

        private int size;

    public HashTable() {
            hashNodes = new ArrayList<>();
            numbuckets = 30;
            size = 0;

            for (int index = 0; index < numbuckets; index++) {
                hashNodes.add(null);
            }
        }


        private int hashCode(K key) {
            return Objects.hashCode(key);
        }


        private int getBucketIndex(K key) {
            int hashCode = hashCode(key);


            int index = hashCode % numbuckets;


            index = index < 0 ? index * -1 : index;

            return index;
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return getSize() == 0;
        }


        public void add(K key, V value) {


            int bucketIndex = getBucketIndex(key);
            int hashCode = hashCode(key);

            HashNode<K, V> head = hashNodes.get(bucketIndex);


            while (head != null) {
                if (head.key.equals(key) && head.hashCode == hashCode) {
                    head.value = value;
                    return;
                }

                head = head.next;
            }


            size++;
            head = hashNodes.get(bucketIndex);
            HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
            newNode.next = head;
            hashNodes.set(bucketIndex, newNode);


            if ((1.0 * size) / numbuckets >= 0.7) {
                ArrayList<HashNode<K, V>> temp = hashNodes;
                hashNodes = new ArrayList<>();
                numbuckets = 2 * numbuckets;
                size = 0;

                for (int index = 0; index < numbuckets; index++) {
                    hashNodes.add(null);
                }

                for (HashNode<K, V> headNode : temp) {
                    while (headNode != null) {
                        add(headNode.key, headNode.value);
                        headNode = headNode.next;
                    }
                }
            }
        }



        public Boolean contains(K key){
            int bucketIndex = getBucketIndex(key);
            int hashCode = hashCode(key);
            HashNode<K, V> head = hashNodes.get(bucketIndex);

            while (head != null) {
                if (head.key.equals(key) && head.hashCode == hashCode) {
                    return true;
                }

                head = head.next;
            }
            return false;

        }


        public V get(K key) {
            int bucketIndex = getBucketIndex(key);
            int hashCode = hashCode(key);

            HashNode<K, V> head = hashNodes.get(bucketIndex);


            while (head != null) {
                if (head.key.equals(key) && head.hashCode == hashCode) {
                    return head.value;
                }

                head = head.next;
            }


            return null;
        }
        public List<K> keySet() {
            List<K> keyList = new ArrayList<>();
            for (HashNode<K, V> node : hashNodes) {
                if (node != null) {
                    if (node.key != null) {
                        keyList.add(node.key);
                    }
                }
            }
            return keyList;
        }


}
