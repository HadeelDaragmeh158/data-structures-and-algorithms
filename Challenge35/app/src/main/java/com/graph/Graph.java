package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Map<Vertex , List<Vertex>> vertexListMap;
    private final Map<Vertex , List<Edge>> vertexListMap1;


////////Constructor
    public Graph() {
        vertexListMap=new HashMap<>();
        vertexListMap1=new HashMap<>();
    }

////////AddVertex Method
    //___________________

    public void addVertex(String data) {

        Vertex vertex = new Vertex(data);

        vertexListMap.putIfAbsent(vertex,new ArrayList<>());
        vertexListMap1.putIfAbsent(vertex,new ArrayList<>());
    }


////////AddEdges Method
     //___________________

    public void addEdges(String data1,String data2){
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        if(vertexListMap.containsKey(vertex1) && vertexListMap.containsKey(vertex1)){
            vertexListMap.get(vertex1).add(vertex1 );
            vertexListMap.get(vertex1).add(vertex1);
        }else {
            throw new IllegalArgumentException();
        }
    }

////////AddNode Method
    //___________________

    public void addNode(String val){
        Vertex vertex=new Vertex(val);
        vertexListMap.putIfAbsent(vertex,new ArrayList<>());
        vertexListMap.putIfAbsent(vertex,new ArrayList<>());
    }

////////getNods Method
    //___________________

    public List<Vertex> getNods(){
        List<Vertex> nodes=new ArrayList<>();
        for (Vertex v : vertexListMap.keySet()) {
            nodes.add(v);
        }
        return nodes;
    }
////////getNeighbors Method
    //___________________

    public List<Vertex> getNeighbors(String value){
        Vertex vertex=new Vertex(value);
        return vertexListMap.get(vertex);
    }


////////Size Method
    //___________________

    public int size(){
        return vertexListMap.size();

    }
    public void addEdgeWeight(String val1, String val2, int weight){
        Edge edge=new Edge(val1,val2,weight);

        Vertex vertex=new Vertex(val1);
        Vertex vertex1=new Vertex(val2);

        vertexListMap1.get(vertex).add(edge);
        vertexListMap1.get(vertex1).add(edge);

    }

    public List<Edge> getWeightedNeighbors(String val){
        Vertex vertex=new Vertex(val);
        return vertexListMap1.get(vertex);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for (Vertex vertex : vertexListMap1.keySet()) {
            stringBuilder.append("[");
            stringBuilder.append(vertex.toString());
            stringBuilder.append("==>");
            stringBuilder.append(vertexListMap1.get(vertex).toString());
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}
