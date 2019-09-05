package algorithm.leetcode

class ReverseIntegerTest extends GroovyTestCase {
    void testReverse() {
        def reverseInteger = new ReverseInteger()
        assertEquals(321, reverseInteger.reverse(123))
        assertEquals(21, reverseInteger.reverse(120000))
        assertEquals(-321, reverseInteger.reverse(-123))
    }
}
