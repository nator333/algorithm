package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    int swapTemp;
    for (int baseIndex = 0; baseIndex < target.length; baseIndex++) {
      for (int iterIndex = (target.length - 1); iterIndex > baseIndex; iterIndex--) {
        ++inspection.calculationCount;

        // index: 0, 1 -> 0, 1
        // value: 2, 1 -> 1, 2
        if (target[iterIndex -1 ] > target[iterIndex]) {
          swapTemp = target[iterIndex];
          target[iterIndex] = target[iterIndex - 1];
          target[iterIndex - 1] = swapTemp;
          ++inspection.swapCount;
        }
      }
    }

    return target;
  }

  @LogExecutionTime
  @Override
  public int[] improvedSort(int[] target) {
    int swapCount = 0;
    int swapTemp;
    for (int baseIndex = 0; baseIndex < target.length; baseIndex++) {
      for (int iterIndex = (target.length - 1); iterIndex > baseIndex; iterIndex--) {
        ++inspection.calculationCount;
        if (target[iterIndex - 1] > target[iterIndex]) {
          ++inspection.swapCount;
          ++swapCount;
          swapTemp = target[iterIndex];
          target[iterIndex] = target[iterIndex - 1];
          target[iterIndex - 1] = swapTemp;
        }
      }
      ++inspection.calculationCount;
      if (swapCount == 0) {
        break;
      }
    }
    return target;
  }
}
