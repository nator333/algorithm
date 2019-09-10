package algorithm.leetcode

class LongestCommonPrefixTest extends GroovyTestCase {
    void testLongestCommonPrefix() {
        def longestCommonPrefix = new LongestCommonPrefix()

        String[] strAry = ["flower","flow","flight"]
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strAry))

        strAry = ["dog","racecar","car"]
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strAry))
    }
}
