package algorithm.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class TwoSomeTest extends Specification {
    @Unroll
    def "Indexes of sum #answer from #nums is #result "() {
        setup:
        def twoSome = new TwoSome.Solution()

        expect:
        result == twoSome.twoSum(nums, answer)

        where:
        nums     | answer || result
        [0, 2]   | 2      || [0, 1]
    }
}
