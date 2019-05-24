/**
 *
 */
class TwoSome {
  fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
      for (j in i + 1 until nums.size) {
        if (nums[i] + nums[j] == target) {
          return intArrayOf(i, j)
        }
      }
    }
    
    throw Exception()
  }
  
  fun nSquare(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    
    for (i in nums.indices) {
      val sub = target - nums[i]
      if (map.containsKey(sub)) {
        return intArrayOf(map[sub]!!, i)
      }
      map[nums[i]] = i
    }
    
    throw Exception()
  }
}