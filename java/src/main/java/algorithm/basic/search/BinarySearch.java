package algorithm.basic.search;

public class BinarySearch extends Search {

  @Override
  public int search(int[] searchAry, int target) {
    int start = 0, end = searchAry.length - 1;
    ++this.inspection.calculationCount;
    int mid = (start + end) / 2;

    ++this.inspection.calculationCount;
    while (start <= end) {
      ++this.inspection.calculationCount;
      if (target == searchAry[mid]) {
        return mid;
      } else if (target > searchAry[mid]) {
        ++this.inspection.calculationCount;
        start = mid + 1;
      } else {
        end = mid - 1;
      }
      ++this.inspection.calculationCount;
      mid = (start + end) / 2;
    }

    return -1;
  }
}
