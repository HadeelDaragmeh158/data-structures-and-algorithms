package TreeIntersection.HashTable;

import java.util.ArrayList;

public class BinaryTree<T> {
    public Node<T> root;
    public ArrayList<T> preOrderArr =new ArrayList<>();
    public ArrayList<T> inOrderArr =new ArrayList<>();

    public BinaryTree() {
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }


    public ArrayList<T> preOrder(Node <T> root){
        if(root == null)
            return preOrderArr;
        preOrderArr.add(root.value);
        if(root.getLeft() !=null){
            preOrder(root.getLeft());
        }
        if(root.getRight()!=null){
            preOrder(root.getRight());
        }

        return preOrderArr;
    }
    public ArrayList<T> InOrder(Node <T> root){
        if(root == null)
            return inOrderArr;
        if(root.getLeft() !=null){
            InOrder(root.getLeft());
        }
        inOrderArr.add(root.value);

        if(root.getRight()!=null){
            InOrder(root.getRight());
        }

        return inOrderArr;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
