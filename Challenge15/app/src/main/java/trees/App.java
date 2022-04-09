package trees;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("\n");
        BinaryTree bt =new BinaryTree();
        bt.setRoot(new Node(5));
        bt.getRoot().setLeftNode(new Node<> (8));
        bt.getRoot().setRightNode(new Node<>(15));
        bt.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        bt.getRoot().getLeftNode().setRightNode(new Node<> (27));

        System.out.println("\n");
        System.out.println("_____________________TEST BT_________________________________");
        System.out.println("_____________________________________________________________\n");
        System.out.println(bt);
        System.out.println("_____________________________________________________________");

        System.out.println("\n");
        BinaryTree postTest = new BinaryTree<>();
        postTest.setRoot(new Node(5));
        postTest.getRoot().setLeftNode(new Node<> (8));
        postTest.getRoot().setRightNode(new Node<>(15));
        postTest.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        postTest.getRoot().getLeftNode().setRightNode(new Node<> (27));
        postTest.postOrder(postTest.getRoot());

        System.out.println("_____________________TEST POSTORDER__________________________");
        System.out.println("_____________________________________________________________\n");
        System.out.println(postTest.getPostOrder());
        System.out.println("_____________________________________________________________");

        System.out.println("\n");
        BinaryTree inTest = new BinaryTree<>();
        inTest.setRoot(new Node(5));
        inTest.getRoot().setLeftNode(new Node (8));
        inTest.getRoot().setRightNode(new Node<>(15));
        inTest.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        inTest.getRoot().getLeftNode().setRightNode(new Node<> (27));
        inTest.inOrder(inTest.getRoot());

        System.out.println("_____________________TEST INORDER__________________________");
        System.out.println("_____________________________________________________________\n");
        System.out.println(inTest.getInOrder());
        System.out.println("_____________________________________________________________");

        System.out.println("\n");
        BinaryTree preTest = new BinaryTree<>();
        preTest.setRoot(new Node(5));
        preTest.getRoot().setLeftNode(new Node <>(8));
        preTest.getRoot().setRightNode(new Node<>(15));
        preTest.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        preTest.getRoot().getLeftNode().setRightNode(new Node<> (27));
        preTest.preOrder(preTest.getRoot());

        System.out.println("_____________________TEST PREORDER__________________________");
        System.out.println("_____________________________________________________________\n");
        System.out.println(preTest.getPreOrder());
        System.out.println("_____________________________________________________________");

        BinarySearchTree bst = new BinarySearchTree(new Node<>(100) );
        bst.add(5);
        bst.add(15);
        bst.add(55);
        bst.add(225);
        System.out.println(bst.getMax());

    }
}
