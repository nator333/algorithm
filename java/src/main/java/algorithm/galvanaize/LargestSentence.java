package algorithm.galvanaize;

import java.util.Arrays;
import java.util.Comparator;

public class LargestSentence {

  public static class Solution {

    public int solution(String S) {
      // write your code in Java SE 8
      if (S == null || S.isEmpty()) {
        return 0;
      }

      return Arrays.stream(S.split("\\."))
          .map(String::trim)
          .map((sentence) ->
              Arrays.stream(sentence.split("\\s"))
                  .filter((splitWord) -> !splitWord.isEmpty()).count()
          )
          .max(Comparator.naturalOrder()).get().intValue();
    }
  }
}
