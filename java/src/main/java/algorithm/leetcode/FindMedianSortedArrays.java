package algorithm.leetcode;

public class FindMedianSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // Merge
    int[] mergedNums = this.merge(nums1, nums2);

    if (mergedNums.length % 2 == 1) {
      return mergedNums[mergedNums.length / 2];
    } else {
      // 0, 1, 2
      int mid = mergedNums.length / 2;
      double sum = mergedNums[mid - 1] + mergedNums[mid];
      return sum / 2;
    }

  }

  private int[] merge(int[] nums1, int[] nums2) {
    int[] mergedNums = new int[nums1.length + nums2.length];
    int nums1Index = 0, nums2Index = 0;
    while (nums1Index < nums1.length && nums2Index < nums2.length) {
      if (nums1[nums1Index] < nums2[nums2Index]) {
        mergedNums[nums1Index + nums2Index] = nums1[nums1Index];
        ++nums1Index;
      } else {
        mergedNums[nums1Index + nums2Index] = nums2[nums2Index];
        ++nums2Index;
      }
    }
    while (nums1Index < nums1.length) {
      mergedNums[nums1Index + nums2Index] = nums1[nums1Index];
      ++nums1Index;
    }
    while (nums2Index < nums2.length) {
      mergedNums[nums1Index + nums2Index] = nums2[nums2Index];
      ++nums2Index;
    }

    return mergedNums;
  }
}
