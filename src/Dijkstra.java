
import java.util.*;

/**
 * Implementation of Dijkstra's algorithm.
 */
public class Dijkstra {

    /**
     * Computes the shortest path from root vertex to all other vertices in the
     * graph and
     * saves the shortest path in each vertex.
     * 
     * @param rootVertex the vertex to compute the shortest path from
     */
    public void computePaths(Vertex rootVertex) {
        // set distance to root vertex to 0
        rootVertex.setMinDistance(0);
        // add root vertex to priority queue
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(rootVertex);

        // visit all vertices
        while (!priorityQueue.isEmpty()) {
            // visit vertex with smallest distance
            Vertex vertex = priorityQueue.poll();
            // visit all edges connected to vertex
            for (Edge edge : vertex.getEdges()) {
                Vertex edgeVertex = edge.getTo();
                int weight = edge.getWeight();
                int minDistance = vertex.getMinDistance() + weight;
                // if new distance is smaller than current distance, update distance and set
                // previous vertex
                if (minDistance < edgeVertex.getMinDistance()) {
                    priorityQueue.remove(vertex);
                    edgeVertex.setPreviousVertex(vertex);
                    edgeVertex.setMinDistance(minDistance);
                    priorityQueue.add(edgeVertex);
                }
            }
        }
    }

    /**
     * Colors the shortest paths from the root vertex to all other vertices in the graph.
     * @param graph the graph
     * @param root the root vertex
     */
    public void colorPaths(UndirectedGraph graph, Vertex root) {
        //for each vertex in the graph
        for (Vertex vertex : graph.getVertices()) {
            //except the root 
            if (vertex != root) {
                //follow the path back to the root
                for (Vertex newVertex = vertex; newVertex != null; newVertex = newVertex.getPreviousVertex()) {
                    //color the edge
                    if (newVertex.getPreviousVertex() != null) {
                        graph.getEdge(newVertex.getPreviousVertex(), newVertex).colored = true;
                    }
                }
            }
        }
    }

    /**
     * Returns the shortest path from the root vertex to the target vertex.
     * @param targetVertex the target vertex
     * @return the shortest path from the root vertex to the target vertex
     */
    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> path = new ArrayList<>();
        // walk back from target vertex to root vertex
        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPreviousVertex()) {
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }

}
