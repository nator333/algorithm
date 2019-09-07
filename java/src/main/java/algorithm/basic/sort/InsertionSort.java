package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;
import algorithm.utils.InspectionUtil.Inspection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertionSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    for (int newIntIndex = 0; newIntIndex < target.length; newIntIndex++) {
      // Find insertion point
      int insertionPointIndex = 0;
      while (insertionPointIndex < newIntIndex) {
        ++this.inspection.calculationCount;
        if (target[insertionPointIndex] > target[newIntIndex]) {
          break;
        }
        insertionPointIndex++;
      }
      // Insert
      int swapInt = target[newIntIndex];
      // 1. Shift element from the end, trying not to overwrite
      for (int i = newIntIndex; i > insertionPointIndex; i--) {
        ++this.inspection.swapCount;
        target[i] = target[i - 1];
      }
      // 2. Insert
      target[insertionPointIndex] = swapInt;
      ++this.inspection.swapCount;
    }

    return target;
  }
}
