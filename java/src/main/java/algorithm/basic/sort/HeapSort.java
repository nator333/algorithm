package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;
import org.springframework.stereotype.Component;

@Component
public class HeapSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    return target;
  }

  private void heapify(int[] target, int parentNodeIndex, int maxIndex) {

  }

}
