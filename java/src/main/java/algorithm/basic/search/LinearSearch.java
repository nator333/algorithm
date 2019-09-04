package algorithm.basic.search;

public class LinearSearch extends Search {

  @Override
  public int search(int[] searchAry, int target) {

    for (int i = 0; i < searchAry.length; i++) {
      ++this.inspection.calculationCount;
      if (searchAry[i] == target) {
        return i;
      }
    }

    this.inspection.calculationCount = searchAry.length;
    return -1;
  }
}
