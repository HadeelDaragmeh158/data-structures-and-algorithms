package AnimalShelter.classes;
import java.util.EmptyStackException;

public class Queue <T>{

    private Node<T> front;
    private Node<T> back;

    public Node<T> getFront() {
        return front;
    }

    public Node<T> getBack() {
        return back;
    }
    public Boolean isEmpty(){
        return front == null;
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            front = newNode;
            back = newNode;

        }else {

            back.setNext(newNode);
            back = newNode;
        }

    }

    public T  dequeue(){
        Node deleteFront;
        if (isEmpty()) throw new EmptyStackException();
        else {
            T valueNode = front.getValue();
            front = front.getNext();
            return valueNode;
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }
}