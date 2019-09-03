package algorithm.basic.sort;

public class QuickSort extends Sort {

  @Override
  public int[] sort(int[] target) {
    // pivot
    int pivotIndex = target.length - 1;

    this.recSort(target, 0, pivotIndex);
    // [4, 8, 2, 5, 7, 6, 3, 10, 1, 9]
    // [15, 24, 4, 9, 5, 16, 8, 6, 22, 1, 18, 25, 19, 10, 20, 21, 3, 14, 17, 23, 13, 12, 2, 7, 11][15, 24, 4, 9, 5, 16, 8, 6, 22, 1, 18, 25, 19, 10, 20, 21, 3, 14, 17, 23, 13, 12, 2, 7, 11]
    return target;
  }

  private void recSort(int[] target, int startIndex, int pivotIndex) {
    ++this.inspection.calculationCount;
    if (startIndex >= pivotIndex) {
      return;
    }

    int leftIndex = startIndex;
    int rightIndex = pivotIndex - 1;
    while (leftIndex != rightIndex && leftIndex <= pivotIndex) {
      ++this.inspection.calculationCount;
      while (target[leftIndex] < target[pivotIndex]) {
        ++this.inspection.calculationCount;
        leftIndex++;
      }

      while (target[rightIndex] > target[pivotIndex] && leftIndex < rightIndex) {
        ++this.inspection.calculationCount;
        rightIndex--;
      }

      ++this.inspection.calculationCount;
      if (leftIndex != rightIndex) {
        int swapInt = target[leftIndex];
        target[leftIndex] = target[rightIndex];
        target[rightIndex] = swapInt;
        ++leftIndex;
        ++this.inspection.swapCount;
      }
    }

    ++this.inspection.calculationCount;
    if (leftIndex == rightIndex && target[pivotIndex] < target[leftIndex]) {
      ++this.inspection.swapCount;
      int swapInt = target[pivotIndex];
      target[pivotIndex] = target[leftIndex];
      target[leftIndex] = swapInt;
    }

    this.recSort(target, startIndex, leftIndex - 1);
    this.recSort(target, leftIndex + 1, pivotIndex);
  }
}
