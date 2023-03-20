import java.util.HashMap;

public class Vertex {

    private String name;
    private HashMap<Vertex, Integer> edges;
    private HashMap<Vertex, Boolean> colored;

    public Vertex(String name) {
        this.name = name;
        this.edges = new HashMap<Vertex, Integer>();
        this.colored = new HashMap<Vertex, Boolean>();
    }

    public String getName() {
        return name;
    }

    public void addEdge(Vertex vertex, int weight) {
        edges.put(vertex, weight);
        colored.put(vertex, false);
    }
    
    public HashMap<Vertex, Integer> getEdges() {
        return edges;
    }

    public void color(Vertex vertex) {
        colored.put(vertex, true);
    }

    public boolean getColor(Vertex vertex) {
        return colored.get(vertex);
    }
}
