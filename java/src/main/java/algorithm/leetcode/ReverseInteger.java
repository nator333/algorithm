package algorithm.leetcode;

public class ReverseInteger {
  public int reverse(int x) {
    int digitsLength = 0;
    int divided = x;
    while (divided != 0) {
      divided /= 10;
      ++digitsLength;
    }

    int result = 0;
    divided = x;
    for (int i = 0; i < digitsLength; i++) {
      result = result * 10  + divided % 10;
      divided /= 10;
    }

    if (x != this.innerReverse(result, digitsLength)) {
      return 0;
    }

    return result;
  }

  private int innerReverse(int x, int originalLength) {

    int digitsLength = 0;
    int divided = x;
    while (divided != 0) {
      divided /= 10;
      ++digitsLength;
    }

    int zerosNeeded = originalLength - digitsLength;

    int result = 0;
    divided = x;
    for (int i = 0; i < digitsLength; i++) {
      result = result * 10 + divided % 10;
      divided /= 10;
    }

    int multiplesLast = 1;
    for (int i = 0; i < zerosNeeded; i++) {
      multiplesLast *= 10;
    }

    return result * multiplesLast;
  }
}
