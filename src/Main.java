

public class Main {
    public static void main(String[] args) {

        UndirectedGraph dijkstraGraph = ExampleGraph.getExampleDirected2();

        Dijkstra dijkstra = new Dijkstra();
        // compute paths
        dijkstra.computePaths(dijkstraGraph.getVertex("A"));
        // color paths
        dijkstra.colorPaths(dijkstraGraph, dijkstraGraph.getVertex("A"));
        // output graph to file
        dijkstraGraph.outputGraphToFile("dijkstra.json");
        // get shortest paths
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("B")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("C")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("D")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("E")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("F")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("G")));
        System.out.println(dijkstra.getShortestPathTo(dijkstraGraph.getVertex("H")));

        System.out.println("Hello world!");
    }
}