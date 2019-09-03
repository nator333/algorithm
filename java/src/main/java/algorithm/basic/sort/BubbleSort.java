package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;

public class BubbleSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    int swapTemp;
    for (int baseIndex = 0; baseIndex < target.length; baseIndex++) {
      for (int iterIndex = (target.length - 1); iterIndex > 0; iterIndex--) {
        ++inspection.calculationCount;

        if (target[iterIndex] < target[iterIndex - 1]) {
          swapTemp = target[iterIndex];
          target[iterIndex] = target[iterIndex - 1];
          target[iterIndex - 1] = swapTemp;
          ++inspection.swapCount;
        }
      }
    }

    return target;
  }

  public int[] improvedSort(int[] target) {
    int swapCount = 0;
    int swapTemp;
    for (int baseIndex = 0; baseIndex < target.length; baseIndex++) {
      for (int iterIndex = (target.length - 1); iterIndex > 0; iterIndex--) {
        ++inspection.calculationCount;
        if (target[iterIndex] < target[iterIndex - 1]) {
          ++inspection.swapCount;
          ++swapCount;
          swapTemp = target[iterIndex];
          target[iterIndex] = target[iterIndex - 1];
          target[iterIndex - 1] = swapTemp;
        }
      }
      if (swapCount == 0) {
        break;
      }
    }
    return target;
  }
}
