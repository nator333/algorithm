package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSome {
  public static class Solution {
    public int[] twoSum(int[] nums, int target) {
      if (nums == null) {
        return null;
      }

      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
        int num = nums[i];
        if (map.containsKey(num)) {
          return new int[]{map.get(num), i};
        } else {
          map.put(target - num, i);
        }
      }
      return null;
    }
  }
}
