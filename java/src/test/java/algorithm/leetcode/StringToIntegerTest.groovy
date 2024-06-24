package algorithm.leetcode

class StringToIntegerTest extends GroovyTestCase {
    void testMyAtoi() {
        def stringToInteger = new StringToInteger()
        assertEquals(123, stringToInteger.myAtoi("123"))
        assertEquals(123, stringToInteger.myAtoi("  123"))
        assertEquals(-123, stringToInteger.myAtoi("  -123"))
        assertEquals(0, stringToInteger.myAtoi(" w -123"))
        assertEquals(0, stringToInteger.myAtoi("--123"))
        assertEquals(0, stringToInteger.myAtoi("-+123"))
        assertEquals(0, stringToInteger.myAtoi("+-2"))
        assertEquals(0, stringToInteger.myAtoi("  +  413"))
        assertEquals(0, stringToInteger.myAtoi(""))
        assertEquals(0, stringToInteger.myAtoi(" "))
        assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi(" -341790843219012908347"))
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi(" 341790843219012908347"))
        assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi("-91283472332"))
        assertEquals(4500, stringToInteger.myAtoi("     +004500"))
        assertEquals(-2147483647, stringToInteger.myAtoi("-2147483647"))
        assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi("-2147483649"))
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi("2147483800"))
        assertEquals(2147483647, stringToInteger.myAtoi("2147483647"))
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi("2147483648"))
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi("2147483649"))



    }
}
