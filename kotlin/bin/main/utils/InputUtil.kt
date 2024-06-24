package utils

import java.util.*

class InputUtil {
  companion object {
    
    /**
     * Get one integer from user
     */
    fun inputInteger(msg: String): Long {
      var inputLong: Long?
      do {
        println(msg)
        try {
          inputLong = Scanner(System.`in`).nextLong()
        } catch (exception: InputMismatchException) {
          inputLong = null
        }
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
        try {
          inputLong = Scanner(System.`in`).nextLong()
        } catch (exception: InputMismatchException) {
          inputLong = 0L
        }
      } while (inputLong <= 0L)
      
      return inputLong
    }
    
    /**
     * Get one integer from user
     */
    fun inputString(msg: String): String {
      println(msg)
      return Scanner(System.`in`).nextLine() ?: ""
    }
    
    /**
     * Get one integer from user
     */
    fun inputNonEmptyString(msg: String): String {
      var inputStr = ""
      do {
        println("$msg ( Must be other than \"\" ):")
        inputStr = Scanner(System.`in`).nextLine()
      } while (inputStr.isEmpty())
      
      return inputStr
    }
    
    
    /**
     * Get one integer from user
     */
    fun inputBoolean(msg: String): Boolean {
      println("$msg (y/n)")
      when (Scanner(System.`in`).nextLine().toLowerCase()) {
        "y" -> return true
        else -> return false
      }
    }
    
    /**
     * Get one integer from user
     */
    fun inputGivenInteger(msg: String, vararg givens: Int): Int {
      val scanner = Scanner(System.`in`)
      println("$msg (${givens.joinToString()}):")
      
      var inputInt: Int
      do {
        try {
          inputInt = scanner.nextInt()
        } catch (exception: InputMismatchException) {
          inputInt = Int.MIN_VALUE
        }
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
      val scanner = Scanner(System.`in`)
      println(msg)
      
      val toListFunc = { input: String ->
        input.trim()
            .split(',')
            // For enormous loading just in case
            .asSequence()
            .filter(Objects::nonNull).filter(String::isNotBlank)
            .map(String::trim).map(String::toLong)
            .take(size)
            .toList()
      }
      
      longList.addAll(toListFunc(scanner.nextLine()))
      while (longList.size < size) {
        println("We need more integers. Input additionally:")
        longList.addAll(toListFunc(scanner.nextLine()))
      }
      
      return longList.toList()
    }
    
    /**
     * Get square integer(s) from user
     */
    fun inputSquareIntegers(): List<List<Long>> {
      val parentLongList = mutableListOf<List<Long>>()
      val scanner = Scanner(System.`in`)
      println("Input one row of integer square:")
      
      val toListFunc = { input: String ->
        input.trim()
            .split(' ')
            // For enormous loading just in case
            .asSequence()
            .filter(Objects::nonNull).filter(String::isNotBlank)
            .map(String::trim).map(String::toLong)
            .take(4)
            .toList()
      }
      
      parentLongList.add(toListFunc.invoke(scanner.nextLine()))
      while (parentLongList.size < 4) {
        println("We need more rows. Input additionally:")
        val additionalInputStr: String = scanner.nextLine()
        parentLongList.add(toListFunc.invoke(additionalInputStr))
      }
      
      return parentLongList;
    }
    
    /**
     * Get integer(s) from user
     */
    fun inputOneLineDoubles(msg: String): List<Double> {
      println(msg)
      return Scanner(System.`in`).nextLine().trim()
          .split(',')
          // For enormous loading just in case
          .asSequence()
          .filter(Objects::nonNull).filter(String::isNotBlank)
          .map(String::trim).map(String::toDouble)
          .toList()
    }
  }
}

