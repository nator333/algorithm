package algorithm.galvanaize;

public class VisibleNodes {
  public static class Tree {
    public int x;
    public Tree l;
    public Tree r;
  }
  public static class Solution {
    public int solution(Tree T) {
      if (T == null) {
        return 0;
      }
      // write your code in Java SE 8
      return recCount(T, T.x);
    }

    /**
     * Recursively count visible nodes
     * 
     * @param T Target tree
     * @param max Max value from top
     * @return Total visible nodes count
     */
    private int recCount(Tree T, int max) {
      if (T == null) {
        return 0;
      }

      int resultCount = 0;
      if (T.x >= max) {
        resultCount = 1;
      }

      int left = 0;
      int right = 0;
      if (T.x < max) {
        right = recCount(T.r, T.x);
        left = recCount(T.l, T.x);
      } else {
        right = recCount(T.r, max);
        left = recCount(T.l, max);
      }

      return resultCount + right + left;
    }
  }
}