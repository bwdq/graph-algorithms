import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class UndirectedGraph implements Graph {

    private HashMap<String, Vertex> vertices;


    public UndirectedGraph() {
        vertices = new HashMap<String, Vertex>();
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
        from.addEdge(to, weight);
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
            output+="\n\"name\": \"" + v.getName() + "\",";
            output+="\n\"edges\": [\n";
            for (Vertex e : v.getEdges().keySet()) {
                output+="{\n";
                output+="\"name\": \"" + e.getName() + "\",";
                output+="\n\"weight\": " + v.getEdges().get(e);
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
