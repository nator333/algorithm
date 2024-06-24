# coding: utf-8
import unittest


## main merge sort function

# 1. Use draw.io to create flowcharts or implement the solutions for the following problems in any programming language.

## a.Check if a given string input is a palindrome.
### ex) abba -> True, ​a​ab​b​ -> False
def isPalindrome(word="") -> bool:
    loweredWord = word.lower()
    return loweredWord == loweredWord[::-1]


## Test
class TestIsPalindrome(unittest.TestCase):
    def test(self):
        print("============================================================== isPalindrome start")
        self.assertFalse(isPalindrome("news"))
        self.assertFalse(isPalindrome("Apple"))
        self.assertTrue(isPalindrome("Whatahw"))
        print("============================================================== isPalindrome   end")


## b.Implement an algorithm to determine if a stringhas all unique characters.
### ex) abcd -> True, a​bb​c -> False
def hasOnlyUniqueChars(word="") -> bool:
    loweredWord = word.lower()
    checkDupAry = [False] * 25
    for characterIndex in range(len(loweredWord)):
        asciiIndex = ord(loweredWord[characterIndex]) - 97
        if (checkDupAry[asciiIndex] == True):
            return False
        checkDupAry[asciiIndex] = True
    return True


## Test
class TestHasOnlyUniqueChars(unittest.TestCase):
    def test(self):
        print("============================================================== hasOnlyUniqueChars start")
        self.assertTrue(hasOnlyUniqueChars("news"))
        self.assertFalse(hasOnlyUniqueChars("Apple"))
        self.assertFalse(hasOnlyUniqueChars("Carc"))
        print("============================================================== hasOnlyUniqueChars   end")


## c.Given two strings, implement an algorithm to decide if one is a permutation of the other.
### ex) abc, cab -> True    abb, cba -> False
def isPermutation(wordA="", wordB="") -> bool:
    if len(wordA) != len(wordB):
        return False

    def convertWordToAsciiAry(word="") -> int[]:
        loweredWord = word.lower()
        asciiAry = [0] * 25
        for i in range(len(loweredWord)):
            asciiIndex = ord(loweredWord[i]) - 97
            asciiAry[asciiIndex] += 1
        return asciiAry

    return convertNumToAry(wordA) == convertNumToAry(wordB)


## Test
class TestIsPermutation(unittest.TestCase):
    def test(self):
        print("============================================================== isPermutation start")
        self.assertTrue(isPermutation("news", "snew"))
        self.assertTrue(isPermutation("Apple", "pplea"))
        self.assertFalse(isPermutation("Carc", "ccrr"))
        print("============================================================== isPermutation   end")


## d.Implement an algorithm to check whether a number(int) is palindrome or not.
### ex) 1111 or 1221 or 12321 -> True    1234 or 1222 or 12322 -> False
def isPalindromeNum(num=0) -> bool:
    numAry = []
    while num // 10 == 0:
        numAry.append(num % 10)

    j = len(numAry)
    for i in range(j // 2):
        if numAry[i] != numAry[j]:
            return False
        j -= 1

    return True


## Test
class TestIsPalindromeNum(unittest.TestCase):
    def test(self):
        print("============================================================== isPalindromeNum start")
        self.assertTrue(isPalindromeNum(12321))
        self.assertTrue(isPalindromeNum(11))
        self.assertTrue(isPalindromeNum(1))
        self.assertFalse(isPalindromeNum(123))
        self.assertFalse(isPalindromeNum(21))
        print("============================================================== isPalindromeNum   end")


unittest.main()
