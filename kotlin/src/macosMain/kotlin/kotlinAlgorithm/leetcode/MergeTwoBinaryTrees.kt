package kotlinAlgorithm.leetcode

class MergeTwoBinaryTrees {
  class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
    
    override fun toString(): String {
      return "`val`:$`val`, left:(${left.toString()}), right:(${right.toString()})"
    }
  }
  
  /**
   * Example:
   * var ti = TreeNode(5)
   * var v = ti.`val`
   * Definition for a binary tree node.
   * class TreeNode(var `val`: Int) {
   *     var left: TreeNode? = null
   *     var right: TreeNode? = null
   * }
   */
  class Solution {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
      // 1. merge parent
      if (t1 == null && t2 == null || t1 != null && t2 == null) {
        // 1. both are null or t2 is null
        return t1
      } else if (t1 == null && t2 != null) {
        // 2. t1 is null
        return t2
      }
      
      // 3. both child is null
      if (t1!!.left == null && t2!!.left == null
          && t1.right == null && t2.right == null) {
        t1.`val` = t1.`val` + t2.`val`
        return t1
      }
      
      // merge child
      // 2. either is null
      t1.`val` = t1.`val` + t2!!.`val`
      if (t1.left == null && t2.left != null) {
        t1.left = t2.left
      } else if (t1.right == null && t2.right != null) {
        t1.right = t2.right
      } else {
        // 3. both have child
        t1.left = mergeTrees(t1.left, t2.left)
        t1.right = mergeTrees(t1.right, t2.right)
      }
      
      return t1
    }
  }
}