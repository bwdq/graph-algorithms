/**
 * A graph interface, ideally I would add more to this.
 */
public interface Graph {

    /**
     * Adds a vertex to the graph.
     * @param name the name of the vertex
     */
    public void addVertex(String name);

    /**
     * Adds an edge to the graph.
     * @param from the name of the vertex the edge is from
     * @param to the name of the vertex the edge is to
     * @param weight the weight of the edge
     */
    public void addEdge(Vertex from, Vertex to, int weight);

    /**
     * Returns the vertex with the given name.
     * @param name the name of the vertex
     * @return the vertex with the given name
     */
    public Vertex getVertex(String name);

}
