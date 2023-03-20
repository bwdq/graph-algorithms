import java.util.ArrayList;

/**
 * Vertex class for the graph
 */
public class Vertex implements Comparable<Vertex>{

    private String name;
    private ArrayList<Edge> edges;
    private Vertex previosVertex;
    private int minDistance = Integer.MAX_VALUE;

    /**
     * Constructor for Vertex
     */
    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<Edge>();
    }

    /**
     * Adds an edge to the vertex
     * @param edge the edge to add
     */
    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }
    
    /**
     * Returns the list of edges
     * @return the list of edges
     */
    public ArrayList<Edge> getEdges() {
        return edges;
    }

    /**
     * Gets the previous vertex
     * @return the previous vertex
     */
    public Vertex getPreviousVertex() {
        return previosVertex;
    }

    /**
     * Sets the previous vertex
     * @param previosVertex the previous vertex
     */
    public void setPreviousVertex(Vertex previosVertex) {
        this.previosVertex = previosVertex;
    }

    /**
     * Gets the minimum distance
     * @return the minimum distance
     */
    public int getMinDistance() {
        return minDistance;
    }

    /**
     * Sets the minimum distance
     * @param minDistance the minimum distance
     */
    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    /**
     * Returns the name of the vertex
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Compares two vertices by minimum distance from root
     */
    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.minDistance);
    }
}
