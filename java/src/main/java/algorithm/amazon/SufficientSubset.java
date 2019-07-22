package algorithm.amazon;

public class SufficientSubset {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public static class Solution {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
      if (root == null) return root;
      if (root.left == null && root.right == null)
        return root.val < limit ? null : root;
      root.left = sufficientSubset(root.left, limit - root.val);
      root.right = sufficientSubset(root.right, limit - root.val);
      // After evaluation, in case both are null, that means the parent isn't also needed.
      return root.left == root.right ? null : root;
    }
  }


}
