package graph.depth.first.graoh;

import java.util.Objects;

public class Vertix {
    String value;
    int weight;

    public Vertix(String value) {
        this.value = value;
    }

    public Vertix(String value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertix vertex = (Vertix) o;
        return Objects.equals(value, vertex.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Vertix{" +
                "value='" + value + '\'' +
                ", weight=" + weight +
                '}';
    }

}
