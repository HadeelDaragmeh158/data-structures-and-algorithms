package graph.depth.first.graoh;

import java.util.*;

public class Graph {
    private Map<Vertix, List<Vertix>> adjVertices;


    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public List<String> depthFirst(Vertix vertex) {
        List<String> visited = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(vertex.getValue());

        while (!stack.isEmpty()) {
            String node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                for (Vertix node1 : getNeighbors(node)) {
                    stack.push(node1.value);
                }
            }
        }
        return visited;
    }

    public Vertix addVerNode(String data) {
        Vertix vertix = new Vertix(data);
        adjVertices.putIfAbsent(vertix,new ArrayList<>());
        return vertix;
    }


    public void addEdge(String data1,String data2){
        Vertix vertix1 = new Vertix(data1);
        Vertix vertix2 = new Vertix(data2);

        adjVertices.get(vertix1).add(vertix2);
        adjVertices.get(vertix2).add(vertix1);
    }

    public void addEdge(String data1,String data2,int weight){
        Vertix vertix1 = new Vertix(data1,weight);
        Vertix vertix2 = new Vertix(data2,weight);

        adjVertices.get(vertix1).add(vertix2);
        adjVertices.get(vertix2).add(vertix1);
    }

    String getNodes() {
        if(size() ==0)
            return null;
        StringBuilder strBuilder = new StringBuilder();
        for (Vertix vertix : adjVertices.keySet()) {
            strBuilder.append(vertix);
            strBuilder.append(adjVertices.get(vertix));
        }

        return strBuilder.toString();
    }


    public List<Vertix> getNeighbors(String data){
        return adjVertices.get(new Vertix(data));
    }

    public int size() {
        return adjVertices.size();
    }

    String printGraph() {
        StringBuilder strBuilder = new StringBuilder();
        for (Vertix vertix : adjVertices.keySet()) {
            strBuilder.append(vertix);
            strBuilder.append(adjVertices.get(vertix));
        }

        return strBuilder.toString();
    }
}

