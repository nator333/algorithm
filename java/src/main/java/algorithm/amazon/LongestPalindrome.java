package algorithm.amazon;

// babab
// cbbd
// abccba
// i == i - 1 -> +1 or i == i - 2 -> +2
// [0, 0, 2, 2, 0] babab
// [0, 0, 1, 0] bb
// [0, 0, 0, 1, 3, 5] abccba
// [0, 0, 0, 2, 4, 6] wabcbaw

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindrome {
  public static class Solution {

    ArrayList<Integer> IDsOfSongs(int rideDuration,
        ArrayList<Integer> songDurations)
    {
      // WRITE YOUR CODE HERE
      if (songDurations == null || songDurations.isEmpty()) {
        return new ArrayList<>();
      }

      ArrayList<ArrayList<Integer>> resultCandidates = new ArrayList<>();
      final int twoSome = rideDuration - 30;
      int maxNum = 0;
      int maxIndex = 0;
      Map<Integer, Integer> subMap = new HashMap<>();
      for (int i = 0; i < songDurations.size(); i++) {
        if (subMap.containsKey(songDurations.get(i))) {
          // get ids
          ArrayList<Integer> result = new ArrayList<>();
          result.add(songDurations.get(i));
          result.add(twoSome - result.get(0));
          resultCandidates.add(result);
          int biggerNum = Math.max(result.get(0), result.get(1));
          if (biggerNum >= maxNum) {
            maxNum = biggerNum;
            maxIndex = resultCandidates.size() - 1;
          }
        } else {
          subMap.put(twoSome - songDurations.get(i), i);
        }
      }

      ArrayList<Integer> result = new ArrayList<>();
      result.add(songDurations.indexOf(resultCandidates.get(maxIndex).get(0)));
      result.add(songDurations.indexOf(resultCandidates.get(maxIndex).get(1)));

      return result;
    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> optimalUtilization(
        int deviceCapacity,
        List<List<Integer>> foregroundAppList,
        List<List<Integer>> backgroundAppList)
    {
      // WRITE YOUR CODE HERE
      Map<Integer, List<List<Integer>>> resultMap = new HashMap<>();
      for (int i = 0; i < foregroundAppList.size(); i++) {
        List<Integer> foregroundApp = foregroundAppList.get(i);
        int seeking = deviceCapacity - foregroundApp.get(1);
        // get min sub
        int min = 0;
        int minIndex = 0;
        for (int j = 0; i < backgroundAppList.size(); j++) {
          int sub = seeking - backgroundAppList.get(j).get(1);
          if (min >= sub) {
            min = sub;
            minIndex = j;
          }
        }

        List<Integer> candidate = new ArrayList<>();
        candidate.add(foregroundApp.get(0));
        candidate.add(backgroundAppList.get(minIndex).get(0));
        int sum = foregroundApp.get(0) + backgroundAppList.get(minIndex).get(0);

        if (!resultMap.containsKey(sum)) {
          resultMap.put(sum, new ArrayList<>());
        }
        resultMap.get(sum).add(candidate);
      }

      return resultMap.get(Collections.max(resultMap.keySet()));
    }

    public String longestPalindrome(String s) {
      if (s == null || s.isEmpty() || s.length() == 1) {
        return s;
      }

      int[] ansAry = new int[s.length()];
      int maxIndex = 0;
      for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == s.charAt(i - 1)) {
          ansAry[i] = ansAry[i - 1] + 1;
          maxIndex = i;
        } else if (i >= 2 && s.charAt(i) == s.charAt(i - 2)) {
          if (ansAry[i - 1] == 2) {
            ansAry[i] = 2;
          } else {
            ansAry[i] = ansAry[i - 1] + 2;
          }

          maxIndex = i;
        }
      }

      if (maxIndex == 0) {
        return ((Character) s.charAt(0)).toString();
      }

      int getLength = ansAry[maxIndex];
      StringBuilder sb = new StringBuilder(getLength + 1);
      for (int j = maxIndex;j >= 0; j--) {
        sb.append(s.charAt(j));
      }

      return sb.toString();
    }
  }
}
