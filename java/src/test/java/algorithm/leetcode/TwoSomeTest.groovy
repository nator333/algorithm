package algorithm.leetcode

class TwoSomeTest extends GroovyTestCase {
    def test() {
        TwoSome twoSome = new TwoSome()

        int[] argIntAry = [3, 1, 2, 5, 4]
        Integer[] ansIntAry = [1, 2]
        assertArrayEquals((Integer[])twoSome.execute(argIntAry, 3), ansIntAry)

        argIntAry = [3, 1, 2, 5, 4]
        ansIntAry = [2, 3]
        assertArrayEquals((Integer[])twoSome.execute(argIntAry, 7), ansIntAry)

        argIntAry = [3, 1, 2, 5, 4]
        ansIntAry = [0, 3]
        assertArrayEquals((Integer[])twoSome.execute(argIntAry, 8), ansIntAry)

        argIntAry = [3, 1, 2, 5, 4]
        ansIntAry = [0, 2]
        assertArrayEquals((Integer[])twoSome.execute(argIntAry, 5), ansIntAry)

        argIntAry = []
        ansIntAry = []
        assertArrayEquals((Integer[])twoSome.execute(argIntAry, 8), ansIntAry)
    }
}
