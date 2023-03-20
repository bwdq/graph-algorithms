

public class Main {
    public static void main(String[] args) {

        UndirectedGraph dijkstraGraph = ExampleGraph.getExampleDirected();
        //Dijkstra.dijkstra(dijkstra, dijkstra.getVertex("A"), dijkstra.getVertex("D"));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePaths(dijkstraGraph.getVertex("A"));
        dijkstra.colorPaths(dijkstraGraph, dijkstraGraph.getVertex("A"));
        dijkstraGraph.outputGraphToFile("dijkstra.json");
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("B")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("C")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("D")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("E")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("F")));

//        Vertex v1 = new Vertex("A");
//        Vertex v2 = new Vertex("B");
//        Vertex v3 = new Vertex("C");
//
//        v1.addEdge(new Edge(1, v1, v2));
//        v1.addEdge(new Edge(10, v1, v2));
//
//        v2.addEdge(new Edge(1, v2, v3));
//
//        Dijkstra dijkstra = new Dijkstra();
//        dijkstra.computePath(v1);
//
//        System.out.println(dijkstra.getShortestPathTo(v3));
/*[A, B]
[A, C]
[A, B, D]
[A, B, D, E]
[A, B, D, E, F]*/
        System.out.println("Hello world!");
    }
}