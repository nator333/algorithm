package algorithm.basic.sort;

import java.util.Arrays;

public class MergeSort extends Sort {

  @Override
  public int[] sort(int[] target) {
    return this.recursiveSort(target, 0, target.length - 1);
  }

  private int[] recursiveSort(int[] target, int startIndex, int endIndex) {
    ++this.inspection.calculationCount;
    if (endIndex - startIndex <= 0) {
      return new int[]{target[startIndex]};
    }

    int midIndex = (startIndex + endIndex) / 2;
    // left
    int[] leftAry = this.recursiveSort(target, startIndex, midIndex);
    // right
    int[] rightAry = this.recursiveSort(target, midIndex + 1, endIndex);
    // merge
    return this.merge(leftAry, rightAry, endIndex - startIndex);
  }

  private int[] merge(int[] leftAry, int[] rightAry, int aryLength) {
    int[] result = new int[aryLength + 1];

    int mergedAryIndex = 0;
    int leftMergedIndex = 0;
    int rightMergedIndex = 0;

    while (leftMergedIndex < leftAry.length && rightMergedIndex < rightAry.length) {
      ++this.inspection.calculationCount;
      if (leftAry[leftMergedIndex] < rightAry[rightMergedIndex]) {
        result[mergedAryIndex] = leftAry[leftMergedIndex];
        ++leftMergedIndex;
        ++this.inspection.swapCount;
      } else {
        result[mergedAryIndex] = rightAry[rightMergedIndex];
        ++rightMergedIndex;
        ++this.inspection.swapCount;
      }
      ++mergedAryIndex;
    }

    while (rightMergedIndex < rightAry.length) {
      ++this.inspection.calculationCount;
      result[mergedAryIndex] = rightAry[rightMergedIndex];
      ++rightMergedIndex;
      ++mergedAryIndex;
      ++this.inspection.swapCount;
    }
    while (leftMergedIndex < leftAry.length) {
      ++this.inspection.calculationCount;
      result[mergedAryIndex] = leftAry[leftMergedIndex];
      ++leftMergedIndex;
      ++mergedAryIndex;
      ++this.inspection.swapCount;
    }

    return result;
  }
}
