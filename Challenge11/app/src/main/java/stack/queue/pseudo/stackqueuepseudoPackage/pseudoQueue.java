package stack.queue.pseudo.stackqueuepseudoPackage;

import java.util.EmptyStackException;

public class pseudoQueue <T> {

    private final Stack myStack = new Stack();
    private final Stack reflectDtackAndPop = new Stack();


///////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////    METHODS   ////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////       GET      ///////////////////////////////////////////////

    public Stack getReflectDtackAndPop() {
        return reflectDtackAndPop;
    }

    public Stack getMyStack() {
        return myStack;
    }


////////////////////////////////       ENQUEUE      ///////////////////////////////////////////////

public void enqueue(T value){
    this.myStack.push(value);
    System.out.println("the value :"+ value + "  Added");
}


////////////////////////////////       DEQUEUE      //////////////////////////////////////////////

    public T dequeue() {
        if (myStack.isEmpty()) {
            throw new EmptyStackException();
        } else if (myStack.getTop().getNext() == null) { /// has one ele
            return (T) myStack.pop();
        } else {
            while (!myStack.isEmpty()) {
                reflectDtackAndPop.push(myStack.peek());
                myStack.pop();
            }

            T valDeleted = (T) reflectDtackAndPop.pop();
            while (!reflectDtackAndPop.isEmpty()) {
                myStack.push(reflectDtackAndPop.peek());
                reflectDtackAndPop.pop();
            }
            return valDeleted;
        }
    }

    @Override
    public String toString() {
    Node pointer = myStack.getTop();
    String stackList = "";
    while (pointer != null){
    stackList=stackList + "["+ pointer.getValue()+"] -> ";
    pointer = pointer.getNext();
    }
    return  stackList;
    }
}
