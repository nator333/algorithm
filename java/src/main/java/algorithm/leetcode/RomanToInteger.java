package algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanToInteger {
  private static final Map<Character, Integer> ROMAN_TO_INT_MAP;
  private static final Map<Character, Set<Character>> CAN_PRF_MAP;

  static {
    char[] array = new char[]{'I','V', 'X' ,'L', 'C', 'D', 'M'};
    ROMAN_TO_INT_MAP = new HashMap<>();
    ROMAN_TO_INT_MAP.put(array[0], 1);
    ROMAN_TO_INT_MAP.put(array[1], 5);
    ROMAN_TO_INT_MAP.put(array[2], 10);
    ROMAN_TO_INT_MAP.put(array[3], 50);
    ROMAN_TO_INT_MAP.put(array[4], 100);
    ROMAN_TO_INT_MAP.put(array[5], 500);
    ROMAN_TO_INT_MAP.put(array[6], 1000);

    CAN_PRF_MAP = new HashMap<>();
    CAN_PRF_MAP.put(array[0], Stream.of(array[1], array[2])
        .collect(Collectors.toCollection(HashSet::new)));
    CAN_PRF_MAP.put(array[2], Stream.of(array[3], array[4])
        .collect(Collectors.toCollection(HashSet::new)));
    CAN_PRF_MAP.put(array[4], Stream.of(array[5], array[6])
        .collect(Collectors.toCollection(HashSet::new)));
  }


  public int romanToInt(String s) {
    if (s == null || s.isEmpty())
        return 0;

    int left = 0;
    int sum = 0;
    int preFixInt = 0;
    while (left < s.length()) {
      char curr = s.charAt(left);
      if (preFixInt == 0 && CAN_PRF_MAP.containsKey(curr)
      && (left + 1 < s.length() && (CAN_PRF_MAP.get(curr).contains(s.charAt(left + 1))))) {
        preFixInt = ROMAN_TO_INT_MAP.get(curr);
      } else {
        sum += ROMAN_TO_INT_MAP.get(curr) - preFixInt;
        preFixInt = 0;
      }
      ++left;
    }

    return sum;
  }
}
