package homework.oct16

class CodebatArray3 {

  fun maxSpan(nums: IntArray): Int {
    if (nums.isEmpty()) {
      return 0
    }

    val intAry = Array(10) { IntArray(2) }
    for (i in intAry.indices) {
      intAry[i][0] = -1
      intAry[i][1] = -1
    }

    for (i in nums.indices) {
      val innerAry = intAry[nums[i] - 1]
      if (innerAry[0] != -1) {
        innerAry[1] = i
      }
      if (innerAry[0] == -1) {
        innerAry[0] = i
      }
    }

    var maxSpan = 0
    for (i in intAry.indices) {
      if (intAry[i][1] != -1 && intAry[i][1] - intAry[i][0] > maxSpan) {
        maxSpan = intAry[i][1] - intAry[i][0]
      }
    }

    return maxSpan + 1

  }


}
