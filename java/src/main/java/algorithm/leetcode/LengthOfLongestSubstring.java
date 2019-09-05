package algorithm.leetcode;

public class LengthOfLongestSubstring {
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.trim().isEmpty()) {
      return 0;
    }
    // aabcdec
    // 154321
    int[] ansIntAry = new int[s.length()];
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      boolean[] asciiFlgAry = new boolean[128];
      ansIntAry[i] = 1;
      asciiFlgAry[s.charAt(i)] = true;
      for (int j = i + 1; j < s.length(); j++) {
        if (asciiFlgAry[s.charAt(j)]) {
          break;
        }
        asciiFlgAry[s.charAt(j)] = true;
        ansIntAry[i] += 1;
      }
      if (max < ansIntAry[i]) {
        max = ansIntAry[i];
      }
    }
    return max;
  }
}
