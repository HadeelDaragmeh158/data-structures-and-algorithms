package trees;

public class BinarySearchTree extends BinaryTree{
 private Node root;

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

        System.out.print("[input: "+value+"]");
        if(root == null) {
            this.root = new Node(value);
            return;
        }
        insertNode(this.root, value);
        System.out.print(" -> inserted: "+value);
        System.out.println();
    }

    private Node insertNode(Node root, Integer data) {

        Node tmpNode = null;
        System.out.print(" ->"+root.getData());
        if(root.getData() >= data) {
            System.out.print(" [L]");
            if(root.getLeftNode() == null) {
                root.setLeftNode(new Node(data));
                return root.getLeftNode();
            } else {
                tmpNode = root.getLeftNode();
            }
        } else {
            System.out.print(" [R]");
            if(root.getRightNode() == null) {
                root.setRightNode(new Node(data));
                return root.getRightNode();
            } else {
                tmpNode = root.getRightNode();
            }
        }

        return insertNode(tmpNode, data);
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", preOrder=" + preOrder +
                ", inOrder=" + inOrder +
                ", postOrder=" + postOrder +
                '}';
    }
}
