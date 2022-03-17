package com.stackandqueue.StackQueue;

import java.util.EmptyStackException;

public class Stack<T>{
     private Node top;


     public Stack() {
         top = null;
     }

     public boolean isEmpty() {
//         Arguments: none
//         Returns: Boolean indicating whether or not the stack is empty.
         return top == null;
     }

     public Node <T>push(T value) {
         Node nodeForValue=new Node(value);
         if (isEmpty()) {
             top = nodeForValue;
         } else {
             nodeForValue.setNext(top);
             top = nodeForValue;

         }
         return nodeForValue;
     }

     public  String pop() {
         if (isEmpty())
            return  "{NULL}";
        else{
            Node popValue=this.top;
            top=top.getNext();
            return popValue.toString();
        }

     }

     public T peek() {
         if (isEmpty()) {
             throw new EmptyStackException();
         }

         return (T) top.getValue();
     }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
