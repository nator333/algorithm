package algorithm.leetcode

class RegularExpressionMatchingTest extends GroovyTestCase {
    void testIsMatch() {
        def regularExpressionMatching = new RegularExpressionMatching();
        assertEquals(true, regularExpressionMatching.isMatch("ab", "ab"))
        assertEquals(true, regularExpressionMatching.isMatch("ab", ".."))
        assertEquals(true, regularExpressionMatching.isMatch("aa", "a*"))
        assertEquals(true, regularExpressionMatching.isMatch("ab", ".*"))
        assertEquals(true, regularExpressionMatching.isMatch("aab", "c*a*b"))
        assertEquals(false, regularExpressionMatching.isMatch("mississippi", "mis*is*p*."))
        assertEquals(false, regularExpressionMatching.isMatch("aa", "a"))
        assertEquals(false, regularExpressionMatching.isMatch("a", ""))
        assertEquals(true, regularExpressionMatching.isMatch("aab", "a*b"))
        assertEquals(true, regularExpressionMatching.isMatch("iss", "s*is*"))
        assertEquals(true, regularExpressionMatching.isMatch("i", "s*is*"))
        assertEquals(true, regularExpressionMatching.isMatch("ssiss", "s*is*"))
        assertEquals(true, regularExpressionMatching.isMatch("ssissippi", "s*is*ip*."))
        assertEquals(true, regularExpressionMatching.isMatch("ab", ".*c"))
    }
}
