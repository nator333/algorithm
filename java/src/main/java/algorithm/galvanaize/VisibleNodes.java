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
      return rec(T, T.x);
    }

    private int rec(Tree T, int max) {
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
        right = rec(T.r, T.x);
        left = rec(T.l, T.x);
      } else {
        right = rec(T.r, max);
        left = rec(T.l, max);
      }

      return resultCount + right + left;
    }
  }
}
