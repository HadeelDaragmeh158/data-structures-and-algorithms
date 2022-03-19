package stack.queue.pseudo.stackqueuepseudoPackage;

public class Node<T> {
    private T value;
    private Node pointerToNextNode ;

    public Node(T value){

        this.value=value;
    }
    public void setNext(Node next) {
        this.pointerToNextNode = next;
    }

    public <T> T getValue() {
        return (T) value;
    }


    public Node getNext() {
        return pointerToNextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                 value +
                '}';
    }
}
