
import java.util.ArrayList;

public class Vertex implements Comparable<Vertex>{

    private String name;
    private ArrayList<Edge> edges;
    private Vertex previosVertex;
    private int minDistance = Integer.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<Edge>();
    }


    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }
    
    public ArrayList<Edge> getEdges() {
        return edges;
    }
    public Vertex getPreviousVertex() {
        return previosVertex;
    }

    public void setPreviousVertex(Vertex previosVertex) {
        this.previosVertex = previosVertex;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.minDistance);
    }
}
