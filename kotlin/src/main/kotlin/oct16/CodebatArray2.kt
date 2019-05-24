package homework.oct16

class CodebatArray2 {

  fun countEvens(nums: IntArray): Int {
    var totalEvenCount = 0
    for (num in nums) {
      if (num % 2 == 0) {
        totalEvenCount++
      }
    }
    return totalEvenCount
  }

  fun bigDiff(nums: IntArray): Int {
    var max = nums[0]
    var min = nums[0]
    for (num in nums) {
      if (max < num) {
        max = num
      } else if (min > num) {
        min = num
      }
    }

    return max - min
  }

  fun centeredAverage(nums: IntArray): Int {
    var max = nums[0]
    var min = nums[0]

    for (num in nums) {
      if (max < num) {
        max = num
      }
      if (min > num) {
        min = num
      }
    }

    var maxFound = false
    var minFound = false
    var total = 0
    var elmNum = 0
    for (num in nums) {
      if (max == num && !maxFound) {
        maxFound = true
        continue
      }
      if (min == num && !minFound) {
        minFound = true
        continue
      }
      elmNum++
      total += num
    }

    return total / elmNum
  }

  fun sum13(nums: IntArray): Int {
    var total = 0
    var i = 0
    while (i < nums.size) {
      if (nums[i] == 13) {
        i++
      } else {
        total += nums[i]
      }
      i++
    }

    return total
  }

  fun sum67(nums: IntArray): Int {
    var total = 0
    var started6 = false

    for (num in nums) {
      if (started6 && num == 7) {
        started6 = false
        continue
      }

      if (num == 6 || started6) {
        started6 = true
        continue
      }
      total += num

    }

    return total
  }


  fun has22(nums: IntArray): Boolean {
    var found2 = false
    var indexOf2 = -1
    for (i in nums.indices) {
      if (nums[i] == 2 && !found2) {
        found2 = true
        indexOf2 = i
      }
      if (indexOf2 != -1 && nums.size > indexOf2 + 1) {
        if (nums[indexOf2 + 1] == 2) {
          return true
        } else {
          found2 = false
        }
      }

    }

    return false
  }

  fun lucky13(nums: IntArray): Boolean {
    for (num in nums) {
      if (num == 1 || num == 3) {
        return false
      }
    }
    return true

  }

  fun sum28(nums: IntArray): Boolean {
    var totalOf2 = 0
    for (num in nums) {
      if (num == 2) {
        totalOf2 += 2
      }
    }
    return totalOf2 == 8
  }

  fun more14(nums: IntArray): Boolean {
    var countOf1 = 0
    var countOf4 = 0

    for (num in nums) {
      if (num == 1) {
        countOf1++
      } else if (num == 4) {
        countOf4++
      }
    }

    return countOf1 > countOf4
  }

  fun fizzArray(n: Int): IntArray {
    val resultAry = IntArray(n)

    for (i in 0 until n) {
      resultAry[i] = i
    }

    return resultAry
  }

  fun only14(nums: IntArray): Boolean {
    for (num in nums) {
      if (num != 1 && num != 4) {
        return false
      }
    }
    return true
  }

  fun fizzArray2(n: Int): Array<String?> {
    val resultAry = arrayOfNulls<String>(n)

    for (i in 0 until n) {
      resultAry[i] = i.toString()
    }

    return resultAry
  }


  fun no14(nums: IntArray): Boolean {
    var has1 = false
    var has4 = false

    for (num in nums) {
      if (num == 1) {
        has1 = true
      } else if (num == 4) {
        has4 = true
      }
    }

    return !(has1 && has4)
  }

  fun isEverywhere(nums: IntArray, `val`: Int): Boolean {
    for (i in nums.indices) {
      if (i + 1 < nums.size) {
        if (nums[i] != `val` && nums[i + 1] != `val`) {
          return false
        }
      }
    }

    return true
  }

  fun either24(nums: IntArray): Boolean {
    var hasStraight2 = false
    var hasStraight4 = false
    for (i in nums.indices) {
      if (i + 1 < nums.size && nums[i] == 2 && nums[i + 1] == 2) {
        hasStraight2 = true
      }
      if (i + 1 < nums.size && nums[i] == 4 && nums[i + 1] == 4) {
        hasStraight4 = true
      }
    }

    return hasStraight2 && !hasStraight4 || !hasStraight2 && hasStraight4
  }


  fun matchUp(nums1: IntArray, nums2: IntArray): Int {
    var similarPairCount = 0

    for (i in nums1.indices) {
      val small = if (nums1[i] < nums2[i]) nums1[i] else nums2[i]
      val big = if (nums1[i] < nums2[i]) nums2[i] else nums1[i]
      if (big - small <= 2 && big != small) {
        ++similarPairCount
      }
    }

    return similarPairCount
  }

  fun has77(nums: IntArray): Boolean {

    for (i in nums.indices) {
      if (nums[i] == 7 && nums.size > i + 1 && nums[i + 1] == 7) {
        return true
      }
      if (nums[i] == 7 && nums.size > i + 2 && nums[i + 2] == 7) {
        return true
      }
    }

    return false
  }

  fun has12(nums: IntArray): Boolean {
    var found1 = false
    for (num in nums) {
      if (found1 && num == 2) {
        return true
      }
      if (num == 1) {
        found1 = true
      }
    }

    return false
  }

  fun modThree(nums: IntArray): Boolean {
    var even = 0
    var odd = 0

    for (i in nums.indices) {
      if (nums[i] % 2 == 0) {
        even++
        odd = 0
      } else {
        odd++
        even = 0
      }

      if (even == 3 || odd == 3) {
        return true
      }
    }

    return false

  }

  fun haveThree(nums: IntArray): Boolean {
    var times = 0
    var was3lastTime = false

    for (num in nums) {
      if (num == 3) {
        if (was3lastTime) {
          return false
        }
        times++
        was3lastTime = true
      } else {
        was3lastTime = false
      }
    }

    return times == 3
  }

  fun twoTwo(nums: IntArray): Boolean {
    if (nums.size == 1 && nums[0] == 2) {
      return false
    }

    for (i in nums.indices) {
      if (nums[i] == 2) {
        // first
        if (i == 0) {
          if (nums[i + 1] != 2) {
            return false
          }
        } else
        // last
          if (i == nums.size - 1) {
            if (nums[i - 1] != 2) {
              return false
            }
          } else {
            if (nums[i - 1] != 2 && nums[i + 1] != 2) {
              return false
            }
          }// center
      }
    }

    return true

  }

  fun sameEnds(nums: IntArray, len: Int): Boolean {

    var i = 0
    var j = nums.size - len
    while (i < len) {
      if (nums[i] != nums[j]) {
        return false
      }
      i++
      j++
    }

    return true
  }

  fun tripleUp(nums: IntArray): Boolean {
    var found = false

    if (nums.size < 3) {
      return false
    }

    for (i in 0 until nums.size - 2) {
      if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
        found = true
      }
    }

    return found
  }

  fun fizzArray3(start: Int, end: Int): IntArray {
    val fizzAry = IntArray(end - start)

    for (i in fizzAry.indices) {
      fizzAry[i] = start + i
    }

    return fizzAry
  }

  fun shiftLeft(nums: IntArray): IntArray {
    if (nums.size == 0) {
      return nums
    }

    val swapInt = nums[0]

    for (i in 0 until nums.size - 1) {
      nums[i] = nums[i + 1]
    }

    nums[nums.size - 1] = swapInt

    return nums
  }


  fun tenRun(nums: IntArray): IntArray {
    var swap10s = -1
    for (i in nums.indices) {
      if (nums[i] % 10 == 0 || nums[i] == 0) {
        swap10s = nums[i]
      } else if (swap10s != -1) {
        nums[i] = swap10s
      }
    }

    return nums
  }

  fun pre4(nums: IntArray): IntArray {
    var index4 = 0
    for (i in nums.indices) {
      if (nums[i] == 4) {
        index4 = i
        break
      }
    }

    val returnAry = IntArray(index4)
    for (i in 0 until index4) {
      returnAry[i] = nums[i]
    }

    return returnAry
  }

  fun post4(nums: IntArray): IntArray {
    var indexLast4 = 0

    for (i in nums.indices) {
      if (nums[i] == 4) {
        indexLast4 = i
      }
    }


    val resultAry = IntArray(nums.size - (indexLast4 + 1))

    var i = indexLast4 + 1
    var j = 0
    while (i < nums.size) {
      resultAry[j] = nums[i]
      i++
      j++
    }

    return resultAry
  }

  fun notAlone(nums: IntArray, `val`: Int): IntArray {
    if (nums.size < 3) {
      return nums
    }


    for (i in 1 until nums.size - 1) {
      if (nums[i - 1] != `val` && nums[i] == `val` && nums[i + 1] != `val`) {
        if (nums[i - 1] > nums[i + 1]) {
          nums[i] = nums[i - 1]
        } else {
          nums[i] = nums[i + 1]
        }
      }
    }


    return nums
  }


  fun zeroFront(nums: IntArray): IntArray {
    var nonZeroVal = 0
    var zeroCount = 0

    for (i in nums.indices) {
      if (nums[i] == 0) {
        zeroCount++
      } else {
        nonZeroVal = nums[i]
      }
    }

    val resultAry = IntArray(nums.size)
    for (i in nums.indices) {
      resultAry[i] = nonZeroVal
    }
    for (i in 0 until zeroCount) {
      resultAry[i] = 0
    }

    return resultAry

  }


  fun withoutTen(nums: IntArray): IntArray {
    var count10 = 0

    for (i in nums.indices) {
      if (nums[i] == 10) {
        count10++
      }
    }

    val result = IntArray(nums.size)

    var i = 0
    var j = 0
    while (i < nums.size) {
      if (nums[i] != 10) {
        result[j] = nums[i]
        j++
      }
      i++
    }

    return result

  }

  fun zeroMax(nums: IntArray): IntArray {
    var maxOdd = 0
    for (i in nums.indices.reversed()) {
      if (nums[i] == 0) {
        nums[i] = maxOdd
      } else if (nums[i] % 2 == 1 && maxOdd < nums[i]) {
        maxOdd = nums[i]
      }
    }

    return nums
  }


  fun evenOdd(nums: IntArray): IntArray {
    var even = 0
    var odd = 0
    var evenCount = 0

    for (i in nums.indices) {
      if (nums[i] % 2 == 0) {
        even = nums[i]
        evenCount++
      } else {
        odd = nums[i]
      }
    }

    var i = 0
    var j = 0
    while (i < nums.size) {
      if (j < evenCount) {
        nums[i] = even
      } else {
        nums[i] = odd
      }
      i++
      j++
    }

    return nums
  }

  fun fizzBuzz(start: Int, end: Int): Array<String> {
    val result = Array(end - start) {
      ""
    }

    var i = start
    var j = 0
    while (i < end) {
      if (i % 15 == 0) {
        result[j] = "FizzBuzz"
      } else if (i % 5 == 0) {
        result[j] = "Buzz"
      } else if (i % 3 == 0) {
        result[j] = "Fizz"
      } else {
        result[j] = i.toString()
      }
      i++
      j++
    }

    return result
  }


}
