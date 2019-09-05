package algorithm.leetcode

class LengthOfLongestSubstringTest extends GroovyTestCase {
    void testLengthOfLongestSubstring() {
        def lengthOfLongestSubstring = new LengthOfLongestSubstring()
        assertEquals(3, lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, lengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"))
        assertEquals(3, lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"))

    }
}
