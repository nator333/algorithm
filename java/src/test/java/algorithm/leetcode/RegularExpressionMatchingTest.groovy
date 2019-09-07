package algorithm.leetcode

class RegularExpressionMatchingTest extends GroovyTestCase {
    void testIsMatch() {
        def regularExpressionMatching = new RegularExpressionMatching();
        assertEquals(true, regularExpressionMatching.isMatch("aa", "a*"))
        assertEquals(true, regularExpressionMatching.isMatch("ab", ".*"))
        assertEquals(true, regularExpressionMatching.isMatch("aab", "c*a*b"))
        assertEquals(false, regularExpressionMatching.isMatch("mississippi", "mis*is*p*."))
    }
}
