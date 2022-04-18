package k.ary.classes;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private final int value;
    private List<Node> nideTree;

    public Node(int element) {
        value = element;
        nideTree = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public void setNode(int value){
        Node node = new Node(value);
        nideTree.add(node);
    }

    public Node getNode() {
        return nideTree.get(nideTree.size()-1);
    }

    public List<Node> getNideTree() {
        return nideTree;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
