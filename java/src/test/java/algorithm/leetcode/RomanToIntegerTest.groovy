package algorithm.leetcode

class RomanToIntegerTest extends GroovyTestCase {
    void testRomanToInt() {
        def romanToInt = new RomanToInteger()

        assertEquals(3, romanToInt.romanToInt("III"))
        assertEquals(4, romanToInt.romanToInt("IV"))
        assertEquals(9, romanToInt.romanToInt("IX"))
        assertEquals(58, romanToInt.romanToInt("LVIII"))
        assertEquals(1994, romanToInt.romanToInt("MCMXCIV"))

    }
}
