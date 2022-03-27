package GetMax;

import java.util.EmptyStackException;

    public class Stack<T> {
        private Node top;


        public Stack() {
            top = null;
        }

        public Node getTop() {
            return top;
        }

        public boolean isEmpty() {
//         Arguments: none
//         Returns: Boolean indicating whether or not the stack is empty.
            return top == null;
        }

        public void  push(T value) {
            Node<T> newNode = new Node<>(value);
            if (isEmpty()){
                top = newNode;
            }else{
                newNode.setNext(top);
                top = newNode;
            }
        }

        public  T pop() {
            if (isEmpty())
                return  null;
            else{
                Node popValue=this.top;
                top=top.getNext();
                return (T) popValue;
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
                    top +
                    '}';
        }

    }