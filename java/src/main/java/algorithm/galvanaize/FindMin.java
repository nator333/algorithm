package algorithm.galvanaize;

public class FindMin {
  public static class Solution {
    public int solution(int[] A) {
      // write your code in Java SE 8
      int min = 1;
      boolean[] exists = new boolean[2_000_000];
      for (int value : A) {
        exists[value + 1_000_000] = true;
        if (min == value) {
          while (exists[min + +1_000_000]) {
            ++min;
          }
        }
      }

      return min;
    }
  }
}
