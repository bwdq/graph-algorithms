
import java.util.*;

public class Dijkstra {
        public void computePaths(Vertex rootVertex) {
            //set distance to root vertex to 0
            rootVertex.setMinDistance(0);
            //add root vertex to priority queue
            PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
            priorityQueue.add(rootVertex);

            //visit all vertices
            while (!priorityQueue.isEmpty()) {
                //visit vertex with smallest distance
                Vertex vertex = priorityQueue.poll();
                //visit all edges connected to vertex
                for (Edge edge : vertex.getEdges()) {
                    Vertex edgeVertex = edge.getTo();
                    int weight = edge.getWeight();
                    int minDistance = vertex.getMinDistance() + weight;
                    //if new distance is smaller than current distance, update distance and set previous vertex
                    if (minDistance < edgeVertex.getMinDistance()) {
                        priorityQueue.remove(vertex);
                        edgeVertex.setPreviousVertex(vertex);
                        edgeVertex.setMinDistance(minDistance);
                        priorityQueue.add(edgeVertex);
                    }
                }
            }
        }

        public void colorPaths(UndirectedGraph graph, Vertex root) {
            for (Vertex vertex : graph.getVertices()) {
                if (vertex != root) {
                    for (Vertex newVertex = vertex; newVertex != null; newVertex = newVertex.getPreviousVertex()) {
                        //color vertex
                        if (newVertex.getPreviousVertex() != null) {
                            graph.getEdge(newVertex.getPreviousVertex(), newVertex).colored = true;
                        }
                    }
                }
            }
            System.out.println('d');
        }

        public List<Vertex> getShortestPathTo(Vertex targetVertex) {//C
            List<Vertex> path = new ArrayList<>();

            for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPreviousVertex()) {
                path.add(vertex);
            }

            Collections.reverse(path);
            return path;
        }
    
}
