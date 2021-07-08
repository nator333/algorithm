package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;
import org.springframework.stereotype.Component;

@Component
public class MergeSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {
    return target;
  }
}
