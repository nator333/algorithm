package algorithm.basic.sort;

import algorithm.utils.InspectionUtil.Inspection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface ISort {
  int[] sort(int[] target);
  int[] improvedSort(int[] target);
}

@Component
public abstract class Sort implements ISort {
  @Autowired
  protected Inspection inspection;

  @Override
  public int[] improvedSort(int[] target) {
    return new int[0];
  }
}
