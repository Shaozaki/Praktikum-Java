import java.util.Scanner;
public class WeightedDirectedGraph {
    private final int vertices;
    private final int [][] adjacencyMatrix;
    
    public WeightedDirectedGraph(int vertices){
        this.vertices = vertices;
        this.adjacencyMatrix = new int [vertices][vertices];
    }

    public void addEdge(int source, int destination, int weight){
        adjacencyMatrix[source][destination] = weight;
    }

    public void displayMatrix() {
        System.out.println("Adjancency Matrix :");

        for (int i = 0; i < vertices; i++){
            for (int j = 0; j < vertices; j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scan.nextInt();

        WeightedDirectedGraph graph = new WeightedDirectedGraph(vertices);

        System.out.println("Enter the edges (source, destination, weight): ");
        while (true) {
            System.out.print("Enter source (-1 to exit): ");
            int source = scan.nextInt();
            if (source == -1) break;

            System.out.print("Enter destination: ");
            int destination = scan.nextInt();

            System.out.print("Enter Weight: ");

            graph.addEdge(source, destination, destination);
        }
        graph.displayMatrix();
        scan.close();
    }
}
