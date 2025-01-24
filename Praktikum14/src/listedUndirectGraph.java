import java.util.*;

@SuppressWarnings("unused")
public class listedUndirectGraph {
    private final Map<Integer, List<Integer>> adjacencyList;

    public listedUndirectGraph() {
        adjacencyList = new HashMap<>();
    }

    
    public void addEdge(int vertex1, int vertex2) {
        adjacencyList.computeIfAbsent(vertex1, k -> new ArrayList<>()).add(vertex2);
        adjacencyList.computeIfAbsent(vertex2, k -> new ArrayList<>()).add(vertex1);
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();

            System.out.print("Vetex " + vertex + ": ");
            for (int n : neighbors) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        listedUndirectGraph graph = new listedUndirectGraph();

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        System.out.println("Adjacency List:");
        graph.printGraph();
    }
}
