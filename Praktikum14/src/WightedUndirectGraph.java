import java.util.Arrays;

public class WightedUndirectGraph {
    public final int[][] adjacencyMatrix;
    private final int vertices;

    public WightedUndirectGraph(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            Arrays.fill(adjacencyMatrix[i], Integer.MAX_VALUE);
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }

    public void printMatrix() {
        System.out.println("Weighted Adjacency Matrizx : ");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (adjacencyMatrix[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INFP\t");
                } else {
                    System.out.print(adjacencyMatrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 4;
        WightedUndirectGraph graph = new WightedUndirectGraph(vertices);
        graph.addEdge(0,1,2);
        graph.addEdge(0,2,4);
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,7);
        graph.addEdge(2,3,3);

        graph.printMatrix();
    }
}
