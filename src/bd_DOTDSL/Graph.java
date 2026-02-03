package bd_DOTDSL;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Graph {

    List<Node> nodes = List.of();
    List<Edge> edges = List.of();
    Map<String, String> attributes = Map.of();

    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Graph(Collection<Node> nodes, Collection<Edge> edges, Map<String, String> attributes) {
        this.nodes = List.copyOf(nodes);
        this.edges = List.copyOf(edges);
        this.attributes = Map.copyOf(attributes);
    }

    public Collection<Node> getNodes() {
        return this.nodes;
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public Graph node(String name) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Graph node(String name, Map<String, String> attributes) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Graph edge(String start, String end) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Map<String, String> getAttributes() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
