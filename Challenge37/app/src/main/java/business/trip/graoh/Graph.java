package business.trip.graoh;

import java.util.*;

public class Graph {
    private Map<Vertix, List<Vertix>> adjVertices;
    public  int cost =0;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public Set<String> breadthFirst(String root){
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            String vertex = queue.poll();
            List<Vertix> vertexNighbors = getNeighbors(String.valueOf(vertex));
            if(vertexNighbors != null) {
                for (Vertix nighbor : vertexNighbors) {
                    if (!visited.contains(nighbor.getValue())) {
                        if (!queue.contains(nighbor.getValue()))
                            queue.add(nighbor.getValue());
                    }
                }
            }
            visited.add(vertex);
        }
        return visited;
    }

    public Vertix addVerNode(String data) {
        Vertix vertex = new Vertix(data);
        adjVertices.putIfAbsent(vertex,new ArrayList<>());
        return vertex;
    }
    public void addEdge(String data1,String data2){
        Vertix vertex1 = new Vertix(data1);
        Vertix vertex2 = new Vertix(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }


    public void addEdge(String data1,String data2,int weight){
        Vertix vertex1 = new Vertix(data1,weight);
        Vertix vertex2 = new Vertix(data2,weight);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    String getVerNodes() {
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
        for (Vertix vertex : adjVertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(adjVertices.get(vertex));
        }

        return strBuilder.toString();
    }


    public int businessTrip(Graph graph, String[] nameCity) {
        cost = 0;
        for (int i = 0; i < nameCity.length- 1; i++) {
            for (Vertix vertex : graph.getNeighbors(nameCity[i])) {
                if (Objects.equals(nameCity[i+1], vertex.value)) {
                    cost += vertex.weight;
                }
            }
        }
        return cost;
    }
}
