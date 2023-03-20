/**
 * Example graphs for testing
 */
public class ExampleGraph {

    /**
     * Example graph I made up
     * @return graph
     */
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

    /**
     * Example graph from Assignment
     * @return graph
     */
    public static UndirectedGraph getExampleDirected2() {
        UndirectedGraph graph = new UndirectedGraph();
        //example vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        //example edges, turns out it requires them in both directions
        graph.addEdge(graph.getVertex("A"), graph.getVertex("D"), 9);
        graph.addEdge(graph.getVertex("A"), graph.getVertex("E"), 5);

        graph.addEdge(graph.getVertex("B"), graph.getVertex("C"), 1);
        graph.addEdge(graph.getVertex("B"), graph.getVertex("D"), 5);
        graph.addEdge(graph.getVertex("B"), graph.getVertex("F"), 9);
        graph.addEdge(graph.getVertex("B"), graph.getVertex("G"), 8);

        graph.addEdge(graph.getVertex("C"), graph.getVertex("B"), 1);
        graph.addEdge(graph.getVertex("C"), graph.getVertex("E"), 9);
        graph.addEdge(graph.getVertex("C"), graph.getVertex("G"), 6);

        graph.addEdge(graph.getVertex("D"), graph.getVertex("A"), 9);
        graph.addEdge(graph.getVertex("D"), graph.getVertex("B"), 5);
        graph.addEdge(graph.getVertex("D"), graph.getVertex("F"), 3);

        graph.addEdge(graph.getVertex("E"), graph.getVertex("A"), 5);
        graph.addEdge(graph.getVertex("E"), graph.getVertex("C"), 9);

        graph.addEdge(graph.getVertex("F"), graph.getVertex("B"), 9);
        graph.addEdge(graph.getVertex("F"), graph.getVertex("D"), 3);

        graph.addEdge(graph.getVertex("G"), graph.getVertex("B"), 8);
        graph.addEdge(graph.getVertex("G"), graph.getVertex("C"), 6);
        graph.addEdge(graph.getVertex("G"), graph.getVertex("H"), 8);

        graph.addEdge(graph.getVertex("H"), graph.getVertex("G"), 8);

        return graph;
    }
    }
