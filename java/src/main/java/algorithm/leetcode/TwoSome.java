package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSome {
  public int[] execute(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return nums;
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
      int num = nums[i];
      if (map.containsKey(num)) {
        return new int[]{map.get(num), i};
      } else {
        // subtraction answer : index
        map.put(target - num, i);
      }
    }
    return null;
  }
}
