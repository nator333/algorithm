package algorithm.amazon;

// babab
// cbbd
// abccba
// i == i - 1 -> +1 or i == i - 2 -> +2
// [0, 0, 2, 2, 0] babab
// [0, 0, 1, 0] bb
// [0, 0, 0, 1, 3, 5] abccba
// [0, 0, 0, 2, 4, 6] wabcbaw

public class LongestPalindrome {
  public static class Solution {
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
