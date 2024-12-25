public class Array3d {
  public static void main(String[] args) {
    int[][][] cube = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, 
    { 7, 8 } }, { { 9, 10 }, { 11, 12 } } };

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
          System.out.print(cube[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
