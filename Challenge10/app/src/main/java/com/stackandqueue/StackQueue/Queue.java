package com.stackandqueue.StackQueue;

import java.util.NoSuchElementException;

public class Queue<T>  {
    private Node front ;
    private Node back ;


    public boolean isEmpty() {
        return front == null;
    }

    public String peek() {
        if (!isEmpty()) {
            return this.front.toString();
        } else{
             return "Empty Queue";
        }
    }

    public void enqueue(T value ){
        Node nodeForThisValue=new Node(value);
        if(isEmpty()){
            front = back = nodeForThisValue;
        }else {
            back.setNext(nodeForThisValue);
            back=nodeForThisValue;
        }

    }

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

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }
}
