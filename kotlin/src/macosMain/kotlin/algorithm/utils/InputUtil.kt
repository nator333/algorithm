package utils

class InputUtil {
  companion object {
    
    /**
     * Get one integer from user
     */
    fun inputInteger(msg: String): Long {
      var inputLong: Long?
      do {
        println(msg)
        inputLong = readLine()?.toLong()
      } while (inputLong == null)
      
      return inputLong
    }
    
    /**
     * Get one integer from user
     */
    fun inputNonZeroInteger(msg: String): Long {
      var inputLong: Long
      do {
        println("$msg ( Must be more than 0 ):")
        inputLong = readLine()?.toLong() ?: 0L
      } while (inputLong <= 0L)
      
      return inputLong
    }
    
    /**
     * Get one integer from user
     */
    fun inputString(msg: String): String {
      println(msg)
      return readLine() ?: ""
    }
    
    /**
     * Get one integer from user
     */
    fun inputNonEmptyString(msg: String): String {
      var inputStr = ""
      do {
        println("$msg ( Must be other than \"\" ):")
        inputStr = readLine()!!
      } while (inputStr.isEmpty())
      
      return inputStr
    }
    
    
    /**
     * Get one integer from user
     */
    fun inputBoolean(msg: String): Boolean {
      println("$msg (y/n)")
      return when (readLine()?.toLowerCase()) {
        "y" -> true
        else -> false
      }
    }
    
    /**
     * Get one integer from user
     */
    fun inputGivenInteger(msg: String, vararg givens: Int): Int {
      println("$msg (${givens.joinToString()}):")
      
      var inputInt: Int
      do {
        inputInt = readLine()?.toInt() ?: Int.MIN_VALUE
      } while (!givens.contains(inputInt) || Int.MIN_VALUE == inputInt)
      
      return inputInt
    }
    
    /**
     * Get one integer from user
     */
    fun inputGivenInteger(msg: String, givens: Array<Int>): Int {
      return this.inputGivenInteger(msg, *givens.toIntArray())
    }
    
    /**
     * Get integer(s) from user
     */
    fun inputIntegers(msg: String, size: Int): List<Long> {
      val longList = mutableListOf<Long>()
      println(msg)
      
      val toListFunc = { input: String ->
        input.trim()
            .split(',')
            // For enormous loading just in case
            .asSequence()
            .filterNotNull().filter(String::isNotBlank)
            .map(String::trim).map(String::toLong)
            .take(size)
            .toList()
      }
      
      longList.addAll(toListFunc(readLine()!!))
      while (longList.size < size) {
        println("We need more integers. Input additionally:")
        longList.addAll(toListFunc(readLine()!!))
      }
      
      return longList.toList()
    }
    
    /**
     * Get square integer(s) from user
     */
    fun inputSquareIntegers(): List<List<Long>> {
      val parentLongList = mutableListOf<List<Long>>()
      println("Input one row of integer square:")
      
      val toListFunc = { input: String ->
        input.trim()
            .split(' ')
            // For enormous loading just in case
            .asSequence()
            .filterNotNull().filter(String::isNotBlank)
            .map(String::trim).map(String::toLong)
            .take(4)
            .toList()
      }
      
      parentLongList.add(toListFunc.invoke(readLine()!!))
      while (parentLongList.size < 4) {
        println("We need more rows. Input additionally:")
        val additionalInputStr: String = readLine()!!
        parentLongList.add(toListFunc.invoke(additionalInputStr))
      }
      
      return parentLongList;
    }
    
    /**
     * Get integer(s) from user
     */
    fun inputOneLineDoubles(msg: String): List<Double> {
      println(msg)
      return readLine()!!.trim()
          .split(',')
          // For enormous loading just in case
          .asSequence()
          .filterNotNull().filter(String::isNotBlank)
          .map(String::trim).map(String::toDouble)
          .toList()
    }
  }
}

