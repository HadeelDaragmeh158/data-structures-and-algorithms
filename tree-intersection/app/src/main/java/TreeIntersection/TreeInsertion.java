package TreeIntersection;

import TreeIntersection.HashTable.BinaryTree;
import TreeIntersection.HashTable.HashTable;

import java.util.ArrayList;

public class TreeInsertion {
    public ArrayList<Integer> IntersectionTwoTrees(BinaryTree tree1, BinaryTree tree2) {

        HashTable<Integer, Integer> hashTable = new HashTable<Integer, Integer>();

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();

        System.out.println("preOrder ->    " + tree1.preOrderArr + "\n");
        System.out.println("InOrder  ->    " + tree2.inOrderArr + "\n");

        for (Object t : tree2.inOrderArr) {
            if (tree1.preOrderArr.contains(t)) {
                hashTable.set((Integer) t, 1);
            }
        }


        return hashTable.keys();
    }
}
