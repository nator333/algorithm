package algorithm.leetcode

class ThreeSumTest extends GroovyTestCase {
    void testThreeSum() {
        def threeSum = new ThreeSum()
        int[] argIntAr = [-1, 0, 1, 2, -1, -4]
        def resultListList = threeSum.threeSum(argIntAr)

        Integer[] expected1 = [-1, 0, 1]
        Integer[] expected2 = [-1, -1, 2]
        assertEquals(2, resultListList.size())
        assertArrayEquals(expected1, resultListList.get(0) as Integer[])
        assertArrayEquals(expected2, resultListList.get(1) as Integer[])

        argIntAr = [3, 0, -2, -1, 1, 2]
        resultListList = threeSum.threeSum(argIntAr)

        expected1 = [-2, -1, 3]
        expected2 = [-2, 0, 2]
        Integer[] expected3 = [-1, 0, 1]
        assertEquals(3, resultListList.size())
        assertArrayEquals(expected1, resultListList.get(0) as Integer[])
        assertArrayEquals(expected2, resultListList.get(1) as Integer[])
        assertArrayEquals(expected3, resultListList.get(2) as Integer[])

    }
}
