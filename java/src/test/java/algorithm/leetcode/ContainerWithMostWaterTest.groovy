package algorithm.leetcode

class ContainerWithMostWaterTest extends GroovyTestCase {
    void testMaxArea() {
        def containerWithMwt = new ContainerWithMostWater()

        int[] argIntAry = [1, 8, 6, 2, 5, 4, 8, 3, 7]
        assertEquals(49, containerWithMwt.maxArea(argIntAry))

        argIntAry = [0]
        assertEquals(0, containerWithMwt.maxArea(argIntAry))

        argIntAry = [1, 8, 6, 2, 1000, 1000, 8, 3, 7]
        assertEquals(1000, containerWithMwt.maxArea(argIntAry))
    }
}
