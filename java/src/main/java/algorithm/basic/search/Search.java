package algorithm.basic.search;

import algorithm.utils.InspectionUtil.Inspection;

interface ISearch {
  int search(int[] searchAry, int target);
}

public class Search implements ISearch {
  public Inspection inspection = new Inspection();

  @Override
  public int search(int[] searchAry, int target) {
    return 0;
  }
}
