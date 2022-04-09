package trees;

import java.util.ArrayList;
import java.util.List;


public class BinaryTree<T extends Comparable<T>>{

    private Node root;
    ArrayList<Integer> preOrder = new ArrayList<>();
    ArrayList<Integer> inOrder = new ArrayList<>();
    ArrayList<Integer> postOrder = new ArrayList<>();

    public BinaryTree(Node root) {
        this.root = root;
    }
    BinaryTree() { root = null; }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public ArrayList<Integer> getPreOrder() {
        return preOrder;
    }

    public ArrayList<Integer> getInOrder() {
        return inOrder;
    }

    public ArrayList<Integer> getPostOrder() {
        return postOrder;
    }

/*
//_____________________________________________________________________________
//_____________________________________________________________________________
//_____________________________________________________________________________
 */
    public void preOrder(Node node) {
        if (root == null)
            return;
        if(node!=null) {
            preOrder.add(node.getData());
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }

    }
    public void inOrder(Node node){
        if (node == null)
            return;
        else {
            inOrder(node.getLeftNode());
            inOrder.add(node.getData());
            inOrder(node.getRightNode());
        }
    }
    public void postOrder(Node node){
        if (node == null)
            return;
        else{
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            postOrder.add(node.getData());
        }

    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "root " + root +
                '}';
    }


}