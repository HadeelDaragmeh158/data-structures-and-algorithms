package GetMax;

public class MaxStack {
    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();


    public void push(int data) {

        int max = data;

        if(!maxStack.isEmpty() && max < maxStack.peek()) {
            max = maxStack.peek();
        }

        st.push(data);
        maxStack.push(max);
    }

    public void pop() {
        st.pop();
        maxStack.pop();
    }

    public int getMax() {
        return maxStack.peek();
    }
}
