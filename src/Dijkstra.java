import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra {

    public static Graph dijkstra(UndirectedGraph graph, Vertex from, Vertex to) {

        HashMap<Vertex, Integer> distances = new HashMap<Vertex, Integer>();
        HashMap<Vertex, Vertex> previous = new HashMap<Vertex, Vertex>();
        HashSet<Vertex> queue = new HashSet<Vertex>();
        //set initial distances to infinity
        for (Vertex vertex : graph.getVertices()) {
            distances.put(vertex, Integer.MAX_VALUE);
            previous.put(vertex, null);
        }
        //add all vertices to queue
        queue.addAll(graph.getVertices());
        //set initial distance to start to 0
        distances.put(from, 0);
        queue.remove(from);
        //while queue is not empty
        while (!queue.isEmpty()) {
            //get vertex with smallest distance
            Vertex vertex = queue.iterator().next();
            queue.remove(vertex);
            //for each edge
            for (Vertex neighbor : vertex.getEdges().keySet()) {
                //get distance to neighbor
                int distance = distances.get(vertex) + vertex.getEdges().get(neighbor);
                //if distance is smaller than current distance
                if (distance < distances.get(neighbor)) {
                    //update distance
                    distances.put(neighbor, distance);
                    //update previous
                    previous.put(neighbor, vertex);
                    //remove neighbor from queue
                    queue.remove(neighbor);
                    //add neighbor to queue
                    queue.add(neighbor);
                }
            }
        }

        
        return graph;
    }
    
}
