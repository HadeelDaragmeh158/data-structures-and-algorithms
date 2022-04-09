package trees;

import java.util.ArrayList;

import static java.sql.Types.NULL;

public class Node <T>{
    final int  data;
    Node<T> leftNode;
    Node<T> rightNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        String result = " ";

        if (data != NULL)
            result=  result   + data ;
        if (leftNode != null)
            result= result + " "+ leftNode ;
        if (rightNode != null)
            result= result + " "+ rightNode ;
//        return  "->" + data +
//                "[ " + leftNode +
//                ", " + rightNode +" ]"+
//                '}';
            return result;
    }
}
