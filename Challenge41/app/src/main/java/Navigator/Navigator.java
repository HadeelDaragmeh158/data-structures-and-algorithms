package Navigator;

import org.w3c.dom.*;

import java.util.Stack;

public class Navigator {


    private Stack<String> visited= new Stack();
    private Stack<String> stackVis ;
    Node backPointer = null;
    Node forewordPointer = null;

    public Navigator(Stack<String> visited, Node backPointer, Node forewordPointer) {
        this.visited = visited;
        this.backPointer = backPointer;
        this.forewordPointer = forewordPointer;
        this.stackVis = visited;             //TODO Don't Forget To find the way
    }

    public Node getBackPointer() {
        return backPointer;
    }

    public void setBackPointer(Node backPointer) {
        this.backPointer = backPointer;
    }

    public Node getForewordPointer() {
        return forewordPointer;
    }

    public void setForewordPointer(Node forewordPointer) {
        this.forewordPointer = forewordPointer;
    }

    public Navigator(Stack<String> visited) {
        this.visited = visited;
    }

    public Stack<String> getVisited() {
        return visited;
    }

    public void setVisited(Stack<String> visited) {
        this.visited = visited;
    }

    public String foreword(){

//        if(forewordPointer != null) {
//            while (visited != null) {
//                if (forewordPointer.getNodeValue()==visited.peek()){
//                    return visited.peek();
//                }
//            stackVis.push(visited.peek());
//            visited.pop();
//            }
//        }
        return null;
    }


    public String Back(){


        return null;
    }

}
