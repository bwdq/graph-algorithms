
/**
 * Edge class with color attribute
 */
public class Edge {
    private int weight;
    private Vertex from;
    private Vertex to;
    boolean colored;

    /**
     * Constructor for Edge
     * @param weight the weight of the edge
     * @param from the vertex the edge is from
     * @param to the vertex the edge is to
     */
    public Edge(int weight, Vertex from, Vertex to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
        colored = false;
    }

    /**
     * Returns the weight of the edge.
     * @return the weight of the edge
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Returns the vertex the edge is going to
     * @return the vertex the edge is going to
     */
    public Vertex getTo() {
        return to;
    }
}
