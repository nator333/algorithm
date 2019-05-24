# coding: utf-8
import unittest
# day6 String Palindrome
## Effective Way
def isPalindrome(suspiciousStr: str) -> bool:
    if isBlank(suspiciousStr):
        return False 
    
    return suspiciousStr == suspiciousStr[::-1]

## Easy Way
def isPalindrome2(suspiciousStr: str) -> bool:
    if isBlank(suspiciousStr):
        return False 
    
    startIndex = 0
    lastIndex = len(suspiciousStr) - 1
    while startIndex < lastIndex:
        if suspiciousStr[startIndex] == suspiciousStr[lastIndex]:
            startIndex += 1
            lastIndex += -1
        else:
            return False
    
    return True

def isBlank (myString):
    return not (myString and myString.strip())

## Test
class TestIsPalindrome(unittest.TestCase):
    def test(self):
        print("============================================================== isPalindrome start")
        self.assertFalse(isPalindrome("Apple"))
        self.assertTrue(isPalindrome("AppA"))
        self.assertTrue(isPalindrome("AppwppA"))
        print("============================================================== isPalindrome   end")
        print("============================================================== isPalindrome2 start")
        self.assertFalse(isPalindrome2("Apple"))
        self.assertTrue(isPalindrome2("AppA"))
        self.assertTrue(isPalindrome2("AppwppA"))
        print("============================================================== isPalindrome2   end")

## Implement which can detect if a word has only unique characters
## Speed and fewer steps
def hasOnlyUniqueCharacter(word = "") -> bool:
    # if set only have unique element, so if word length and set length differ,
    # word has same character in it
    return len(word) == len(set(list(word)))

## Test
class TestHasOnlyUniqueCharacter(unittest.TestCase):
    def test(self):
        print("============================================================== hasUniqueCharacter start")
        self.assertFalse(hasOnlyUniqueCharacter("asdfghjklqwertyuioa"))
        self.assertTrue(hasOnlyUniqueCharacter("asdfghjklqwertyuio"))
        self.assertFalse(hasOnlyUniqueCharacter("   "))
        self.assertTrue(hasOnlyUniqueCharacter(""))
        print("============================================================== hasUniqueCharacter   end")

unittest.main()