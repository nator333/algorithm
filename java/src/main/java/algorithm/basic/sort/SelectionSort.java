package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;

public class SelectionSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    int minIndex, swapTemp;

    for (int baseIndex = 0; baseIndex < target.length; baseIndex++) {
      minIndex = baseIndex;
      for (int iterIndex = baseIndex; iterIndex < target.length; iterIndex++) {
        ++inspection.calculationCount;
        if (target[minIndex] > target[iterIndex]) {
          minIndex = iterIndex;
        }
      }
      // swap
      if (baseIndex != minIndex) {
        ++inspection.swapCount;
        swapTemp = target[baseIndex];
        target[baseIndex] = target[minIndex];
        target[minIndex] = swapTemp;
      }
    }

    return target;
  }
}
