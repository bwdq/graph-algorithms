public class Main {
    public static void main(String[] args) {
        UndirectedGraph dijkstra = ExampleGraph.getExampleDirected();
        Dijkstra.dijkstra(dijkstra, dijkstra.getVertex("A"), dijkstra.getVertex("D"));
        dijkstra.outputGraphToFile("dijkstra.json");

        System.out.println("Hello world!");
    }
}