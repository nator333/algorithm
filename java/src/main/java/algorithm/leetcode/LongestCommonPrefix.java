package algorithm.leetcode;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";

    int left = 0;
    breakWhile:
    while (left < strs[0].length()) {
      String prefix = strs[0].substring(0, left + 1);
      for (int i = 0; i < strs.length; i++) {
          if (!strs[i].startsWith(prefix))
            break breakWhile;
      }
      ++left;
    }

    return strs[0].substring(0, left);
  }
}
