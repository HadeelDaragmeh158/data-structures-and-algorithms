package stackqueuepseudo;

import com.stackandqueue.StackQueue.Node;

public class PseudoQueue <T>{
    private Node front ;
    private Node back ;

    public boolean isEmpty() {
        return front == null;
    }
//  Inserts value into the PseudoQueue, using a first-in, first-out approach.
    public void enqueue(T value ){
        Node nodeForThisValue=new Node(value);
        if(isEmpty()){
            front = back = nodeForThisValue;
        }else {
            back.setNext(nodeForThisValue);
            back=nodeForThisValue;
        }

    }

//    Extracts a value from the PseudoQueue, using a first-in, first-out approach.h
    public String dequeue(){
        Node deleteFromFront;
        if (isEmpty()) {
            return "Empty Queue";
        } else {
            deleteFromFront = front;
            front = front.getNext();
        }
        return deleteFromFront.toString();
    }
}
