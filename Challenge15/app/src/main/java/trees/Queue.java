package trees;

import java.util.EmptyStackException;

public class Queue <T>{
    QNode<T> front;
    QNode<T> back;

    public Queue() {

    }
    public void enqueue (T newValue){
        QNode<T> newNode = new QNode<>(newValue);

        if(!this.isEmpty())
        {
            this.back.next = newNode;
            this.back = newNode;
        }else
        {
            this.back=newNode;
            this.front=newNode;
        }
    }

    public QNode<T> dequeue (){
        try {
            if (!this.isEmpty()) {
                QNode<T> delete = this.front;
                if (this.front == this.back) {
                    this.back = this.back.next;
                }
                this.front = this.front.next;
                return delete;
            }
        }
        catch (EmptyStackException err){
            System.out.println(err.getMessage());
        }
        return null;
    }

    public T peek (){
        try{
            if (!this.isEmpty())
                return this.front.value;
        }catch (EmptyStackException err){
            System.out.println(err.getMessage());
        }
        return null;
    }

    public boolean isEmpty(){
        return this.front==null;
    }


    @Override
    public String toString() {
        String result ="";
        result+='[';
        QNode pointer = this.front;

            while (pointer.next != null) {
                result += pointer.value + " , ";
                pointer = pointer.next;
            }
            result += pointer.value;
            result += ']';

        return result;
    }

}