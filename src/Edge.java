
public class Edge {
    private int weight;
    private Vertex from;
    private Vertex to;
    boolean colored;

    public Edge(int weight, Vertex from, Vertex to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
        colored = false;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getTo() {
        return to;
    }
}
