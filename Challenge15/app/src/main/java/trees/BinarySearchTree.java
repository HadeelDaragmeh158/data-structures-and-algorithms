package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree extends BinaryTree{
    private Node root;
    private int max = 0;

    public BinarySearchTree(Node root, Node root1) {
        super(root);
        this.root = root1;
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(Integer value) {
        if(root == null) {
            this.root = new Node(value);
            return;
        }
        insertNode(this.root, value);


    }

    private Node insertNode(Node root, Integer data) {

        Node tmpNode = null;

        if(root.getData() >= data) {

            if(root.getLeftNode() == null) {
                root.setLeftNode(new Node(data));

                return root.getLeftNode();
            } else {
                tmpNode = root.getLeftNode();
            }
        } else {
            if(root.getRightNode() == null) {
                root.setRightNode(new Node(data));
                return root.getRightNode();
            } else {
                tmpNode = root.getRightNode();
            }
        }

        return insertNode(tmpNode, data);
    }


    public Integer getMax(){
        if (root == null) {
            System.out.println(" Empty tree ");
            return null;
        }
        else {
            max(root);
        }

        return max;
    }
    private void max(Node node){
        if(node != null) {
            if((Integer)node.getData() > max){
                max = (Integer)node.getData();}
            max(node.getLeftNode());
            max(node.getRightNode());
        }
    }
    public List breadthFirst ()
    {
        List<Integer> bF = new ArrayList<>();

        if(this.root==null)
        {
            return bF;
        }
        Queue <Node<Integer>> queue= new Queue<>();
        queue.enqueue(this.root);

        while(!queue.isEmpty()){
            Node <Integer> node= queue.dequeue().value;

            bF.add( node.data);
            if(node.leftNode!=null){
                queue.enqueue(node.leftNode);
            }

            if(node.rightNode!=null) {
                queue.enqueue(node.rightNode);
            }
        }
        return bF ;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}