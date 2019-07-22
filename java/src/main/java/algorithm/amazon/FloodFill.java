package algorithm.amazon;

public class FloodFill {
  public static class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

      boolean[][] checkedCells = new boolean[image.length][image[0].length];
      return this.fourDimensions(image, sr, sc, newColor, checkedCells);
    }

    private int[][] fourDimensions(int[][] image, int sr, int sc, int newColor, boolean[][] checkedCells) {
      if (checkedCells[sr][sc]) {
        return image;
      } else {
        checkedCells[sr][sc] = true;
      }

      int beforeColor = image[sr][sc];
      image[sr][sc] = newColor;

      if (sr + 1 < image.length && image[sr + 1][sc] == beforeColor) {
        this.fourDimensions(image, sr + 1, sc, newColor, checkedCells);
      }
      if (sr - 1 >= 0 && image[sr - 1][sc] == beforeColor) {
        this.fourDimensions(image, sr - 1, sc, newColor, checkedCells);
      }
      if (sc + 1 < image[sr].length && image[sr][sc + 1] == beforeColor) {
        this.fourDimensions(image, sr, sc + 1, newColor, checkedCells);
      }
      if (sc - 1 >= 0 && image[sr][sc - 1] == beforeColor) {
        this.fourDimensions(image, sr, sc - 1, newColor, checkedCells);
      }

      return image;
    }
  }

  public static void print(int[][] image) {
    for (int[] ints : image) {
      for (int anInt : ints) {
        System.out.print(anInt + ", ");
      }
      System.out.println();
    }
  }
}
