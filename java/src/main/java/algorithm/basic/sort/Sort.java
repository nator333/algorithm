package algorithm.basic.sort;

import algorithm.utils.InspectionUtil;
import algorithm.utils.InspectionUtil.Inspection;

interface ISort {
  int[] sort(int[] target);
  int[] improvedSort(int[] target);
}

public abstract class Sort implements ISort {
  // For inspection
  protected Inspection inspection = InspectionUtil.createInspection();

  @Override
  public int[] improvedSort(int[] target) {
    return new int[0];
  }
}
