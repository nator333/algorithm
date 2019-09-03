package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;

public class InsertionSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    for (int newIntIndex = 0; newIntIndex < target.length; newIntIndex++) {
      // Find insertion point
      int insertionPointIndex = 0;
      for (; insertionPointIndex < newIntIndex; insertionPointIndex++) {
        ++this.inspection.calculationCount;
        if (target[insertionPointIndex] > target[newIntIndex]) {
          break;
        }
      }
      // Insert
      int swapInt = target[newIntIndex];
      // Shift element from the end trying not to overwrite
      for (int i = newIntIndex; i > insertionPointIndex; i--) {
        ++this.inspection.swapCount;
        target[i] = target[i - 1];
      }
      target[insertionPointIndex] = swapInt;
      ++this.inspection.swapCount;
    }

    return target;
  }
}
