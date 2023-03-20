public class ExampleGraph {
    

    public static UndirectedGraph getExampleDirected() {

        UndirectedGraph graph = new UndirectedGraph();

        //example vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        //example edges
        graph.addEdge(graph.getVertex("A"), graph.getVertex("B"), 1);
        graph.addEdge(graph.getVertex("A"), graph.getVertex("C"), 2);
        graph.addEdge(graph.getVertex("B"), graph.getVertex("D"), 3);
        graph.addEdge(graph.getVertex("C"), graph.getVertex("D"), 4);
        graph.addEdge(graph.getVertex("D"), graph.getVertex("E"), 5);
        graph.addEdge(graph.getVertex("E"), graph.getVertex("F"), 6);
        graph.addEdge(graph.getVertex("F"), graph.getVertex("A"), 7);

        return graph;
    }
}
