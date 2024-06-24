package algorithm.leetcode

class FindMedianSortedArraysTest extends GroovyTestCase {
    void testFindMedianSortedArrays() {
        def findMedianSortedArrays = new FindMedianSortedArrays()

        int[] nums1 = [1, 3]
        int[] nums2 = [2]
        assertEquals(2.0, findMedianSortedArrays.findMedianSortedArrays(nums1, nums2))


        nums1 = [1, 3]
        nums2 = [2, 4]
        assertEquals(2.5, findMedianSortedArrays.findMedianSortedArrays(nums1, nums2))
    }
}
