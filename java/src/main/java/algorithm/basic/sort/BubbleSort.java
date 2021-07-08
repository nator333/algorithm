package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    return target;
  }

  @LogExecutionTime
  @Override
  public int[] improvedSort(int[] target) {
    return target;
  }
}
