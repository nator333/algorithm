package leetcode

fun main(args: Array<String>) {
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
      AddTwoNumbers.ListNode(arrayOf(9)),
      AddTwoNumbers.ListNode(arrayOf(1, 9, 9, 9, 9, 9, 9, 9, 9, 9))
  ) == AddTwoNumbers.ListNode(arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)))
}