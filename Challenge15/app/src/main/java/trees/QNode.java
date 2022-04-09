package trees;

public class QNode <T> {
    T value;
    QNode next ;

    public QNode(T value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Node{" +
                value +
                '}';
    }
}
