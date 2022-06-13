package TreeIntersection;

import TreeIntersection.HashTable.BinaryTree;
import TreeIntersection.HashTable.Node;

public class App {
    public static void main(String[] args) {
//--------------tree1
        BinaryTree<Integer> tree=new BinaryTree<Integer>();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.root.left.right.left = new Node(8);
        tree.root.left.right.right = new Node(9);
        tree.root.right.right.left = new Node(10);
        tree.root.right.right.right = new Node(11);


//------------------tree2
        BinaryTree<Integer> tree1 =new BinaryTree<Integer>();

        tree1.root = new Node(11);
        tree1.root.left = new Node(10);
        tree1.root.right = new Node(90);

        tree1.root.left.left = new Node(8);
        tree1.root.left.right = new Node(7);
        tree1.root.right.left = new Node(6);
        tree1.root.right.right = new Node(50);

        tree1.root.left.right.left = new Node(4);
        tree1.root.left.right.right = new Node(3);
        tree1.root.right.right.left = new Node(2);
        tree1.root.right.right.right = new Node(100);


        tree1.InOrder(tree.getRoot());

        tree.preOrder(tree1.getRoot());

        TreeInsertion treeInsertion = new TreeInsertion();

        System.out.println("---RESULT-------------------");
        System.out.println("Intersection  -> "+ treeInsertion.IntersectionTwoTrees(tree, tree1));

    }
}
