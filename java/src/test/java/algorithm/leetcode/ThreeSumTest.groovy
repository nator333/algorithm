package algorithm.leetcode

class ThreeSumTest extends GroovyTestCase {
    void testThreeSum() {
        def threeSum = new ThreeSum()
        int[] argIntAr = [-1, 0, 1, 2, -1, -4]
        def resultListList = threeSum.threeSum(argIntAr)

        Integer[] expected1 = [-1, 0, 1]
        Integer[] expected2 = [-1, -1, 2]
        assertArrayEquals(expected1, resultListList.get(0) as Integer[])
        assertArrayEquals(expected2, resultListList.get(1) as Integer[])
    }
}
