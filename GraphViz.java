public class GraphViz {
    int left;
    int right;
    String label;

    public GraphViz(int left, int right, String label) {
        this.left = left;
        this.right = right;
        this.label = label;
    }

    public String generateGraph() {
        String graph = "";
        graph = graph.concat(this.left + " -> " + this.right + " ");
        graph = graph.concat("[label = " + this.label + "]");
        return graph;
    }
}
