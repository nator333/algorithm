package algorithm.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InspectionUtil {
  private static final Logger logger = LoggerFactory.getLogger(InspectionUtil.class);

  public static class Inspection {
    private int outCount = 0;
    public int swapCount = 0;
    public int calculationCount = 0;

    public void printComplexity(int aryLength) {
      ++outCount;
      logger.info(
          this.outCount + ", " + aryLength + " elements, calculationCount = " + this.calculationCount + ", swapCount = "
              + this.swapCount);
      this.swapCount = 0;
      this.calculationCount = 0;
    }
  }
}
