package algorithm.leetcode;

public class StringToInteger {
  public int myAtoi(String str) {
    if (str.length() == 0) {
      return 0;
    }

    // Find Start Index
    int startIndex = 0;
    int signsCount = 0;
    boolean isSigned = false;
    for (int i = 0; i < str.length(); i++) {
      // Space
      if (str.charAt(i) == 32) {
        if (signsCount > 0) {
          return 0;
        }
        continue;
      }
      // Plus sign
      if (str.charAt(i) == 43) {
        ++signsCount;
        continue;
      }

      // In case not number nor sign
      if (str.charAt(i) != 45 && (str.charAt(i) < 48 || str.charAt(i) > 57)) {
        return 0;
      } else {
        if (str.charAt(i) == 45) {
          isSigned = true;
          ++signsCount;
        }
        startIndex = i;
        break;
      }
    }

    if (signsCount > 1) {
      return 0;
    }

    if (isSigned || str.charAt(startIndex) == 43) {
      ++startIndex;
    }
    int resultInt = 0;
    while (startIndex < str.length()) {
      if (str.charAt(startIndex) < 48 || str.charAt(startIndex) > 57) {
        break;
      }

      int digit = str.charAt(startIndex) - 48;
      digit = isSigned ? -digit : digit;
      if (isSigned) {
        if (resultInt <= Integer.MIN_VALUE / 10
            && (resultInt != Integer.MIN_VALUE / 10 || digit < -8)) {
          return Integer.MIN_VALUE;
        }
      } else {
        if (resultInt >= Integer.MAX_VALUE / 10
            && (resultInt != Integer.MAX_VALUE / 10 || digit > 7)) {
          return Integer.MAX_VALUE;
        }
      }

      resultInt = resultInt * 10 + digit;
      ++startIndex;
    }

    return resultInt;
  }
}
