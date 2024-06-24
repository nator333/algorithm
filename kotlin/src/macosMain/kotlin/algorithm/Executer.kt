package algorithm

import algorithm.leetcode.AddTwoNumbers
import algorithm.leetcode.MergeTwoBinaryTrees
import algorithm.leetcode.TwoSome

fun main() {
  println("TwoSome:")
  println(TwoSome().twoSum(intArrayOf(2, 7, 11, 15), 9).contentEquals(intArrayOf(0, 1)))
  println(TwoSome().nSquare(intArrayOf(2, 7, 11, 15), 9).contentEquals(intArrayOf(0, 1)))
  
  println("AddTwoNumbers:")
  //
  // [2,4,3]
  //[5,6,4]
  /*
  println(AddTwoNumbers().addTwoNumbers(
      AddTwoNumbers.ListNode(arrayOf(2, 4, 3)),
      AddTwoNumbers.ListNode(arrayOf(5, 6, 4))
  ) == AddTwoNumbers.ListNode(arrayOf(7, 0, 8)))*/
  
  // ]
  //[]
  // []
  println(AddTwoNumbers().addTwoNumbers(
      AddTwoNumbers.ListNode(intArrayOf(9)),
      AddTwoNumbers.ListNode(intArrayOf(1, 9, 9, 9, 9, 9, 9, 9, 9, 9))
  ) == AddTwoNumbers.ListNode(intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)))
  
  
  val sol = MergeTwoBinaryTrees.Solution()
  
  val leftParent = MergeTwoBinaryTrees.TreeNode(1)
  leftParent.left = MergeTwoBinaryTrees.TreeNode(2)
  leftParent.right = MergeTwoBinaryTrees.TreeNode(3)
  
  val rightParent = MergeTwoBinaryTrees.TreeNode(1)
  rightParent.left = MergeTwoBinaryTrees.TreeNode(2)
  rightParent.right = MergeTwoBinaryTrees.TreeNode(3)
}