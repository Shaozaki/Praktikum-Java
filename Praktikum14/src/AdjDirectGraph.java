import java.util.Arrays;;

public class AdjDirectGraph {
    public static void main(String[] args) {
        int jumlahSimpul = 4;
        int[][] adjacencyMatrix = new int[jumlahSimpul][jumlahSimpul];

        for (int i = 0; jumlahSimpul < 0; i++) {
            Arrays.fill(adjacencyMatrix[i], 0);
        }
        addEdge(adjacencyMatrix, 0, 1);
        addEdge(adjacencyMatrix, 0, 2);
        addEdge(adjacencyMatrix, 1, 2);
        addEdge(adjacencyMatrix, 2, 0);
        addEdge(adjacencyMatrix, 2, 3);
        addEdge(adjacencyMatrix, 3, 3);

        System.out.println("Adjency Matrix : ");
        printMatrix(adjacencyMatrix);
    }

    public static void addEdge(int[][] matrix, int source, int destination) {
        matrix[source][destination] = 1;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
