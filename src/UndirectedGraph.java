import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class UndirectedGraph implements Graph {

    private HashMap<String, Vertex> vertices;
    private HashMap<String, Edge> toList;
    private HashMap<String, Edge> fromList;

    public UndirectedGraph() {
        vertices = new HashMap<String, Vertex>();
        toList = new HashMap<String, Edge>();
        fromList = new HashMap<String, Edge>();
    }


    /**
     * Adds a vertex to the graph.
     *
     * @param name the name of the vertex
     */
    @Override
    public void addVertex(String name) {
        if (!vertices.containsKey(name)) {
            vertices.put(name, new Vertex(name));
        }
    }

    @Override
    public void addEdge(Vertex from, Vertex to, int weight) {
        Edge edge = new Edge(weight, from, to);
        from.addEdge(edge);
        //to.addEdge(new Edge(weight, to, from));
        toList.put(to.toString() + from, edge);
        fromList.put(from.toString() + to, edge);

    }

    public Edge getEdge(Vertex from, Vertex to) {
        Edge edge = toList.get(from.toString() + to);
        if (edge == null) {
            edge = fromList.get(from.toString() + to);
        }
        return edge;
    }

    public void addEdge(String to, String from, int weight) {
        Edge edge = new Edge(weight, getVertex(from), getVertex(to));
        getVertex(from).addEdge(edge);
    }

    public ArrayList<Vertex> getVertices() {
        ArrayList<Vertex> vertices = new ArrayList<Vertex>();
        for (Vertex v : this.vertices.values()) {
            vertices.add(v);
        }
        return vertices;
    }


    /**
     * Returns the vertex with the given name.
     *
     * @param name the name of the vertex
     * @return the vertex with the given name
     */
    @Override
    public Vertex getVertex(String name) {
        return vertices.get(name);
    }


    public void outputGraphToFile(String filename) {

        //java write to file
        File file = new File(filename);
        //if file doesnt exists, overwrite it
        if (file.exists()) {
            file.delete();
        }
        //ouput to file
        //format is: list of vertices []
        //edge verex weight
        String output = "";

        FileWriter fw = null;
        try {
            fw = new FileWriter(file.getAbsoluteFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        output+="{\n\"vertices\": [\n";

        for (Vertex v : vertices.values()) {
            output+="{\n";
            output+="\n\"name\": \"" + v + "\",";
            output+="\n\"edges\": [\n";
            for (Edge e : v.getEdges()) {
                output+="{\n";
                output+="\"name\": \"" + e.getTo() + "\",";
                output+="\n\"color\": " + e.colored + ",";
                output+="\n\"weight\": " + e.getWeight();
                output+="\n},\n";
            }
            output = output.substring(0, output.length() - 2);
            output+="\n]\n},";
        }
        output = output.substring(0, output.length() - 1);
        output+="\n]\n}";
        try {
            bw.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
