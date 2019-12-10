package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      Set<Integer> indexSet = new HashSet<>();
      indexSet.add(i);
      this.backtrack(nums, indexSet, nums[i], result);
    }

    result.forEach(Collections::sort);

    return result;
  }

  private void backtrack(int[] nums, Set<Integer> indexSet, int sum, List<List<Integer>> result) {
    if (indexSet.size() >= 3) {
      System.out.println("exit");
      return;
    }
    // [-1, 0, 1, 2, -1, -4]
    for (int i = 0; i < nums.length; i++) {
      if (indexSet.contains(i)) {
        continue;
      }

      if (indexSet.size() == 2) {
        indexSet.add(i);
        if (sum + nums[i] == 0) {
          List<Integer> answer = indexSet.stream().map(indexElm -> nums[indexElm]).collect(Collectors.toList());
          if (result.stream().noneMatch(existingSet -> existingSet.size() == answer.size() && answer.containsAll(existingSet))) {
            result.add(answer);
            break;
          }
        }
        indexSet.remove(i);
      } else {
        indexSet.add(i);
        sum += nums[i];
        this.backtrack(nums, indexSet, sum, result);
      }
    }
  }

}
