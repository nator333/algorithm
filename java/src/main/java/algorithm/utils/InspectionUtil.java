package algorithm.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

public class InspectionUtil {
  private InspectionUtil() {}

  public static class Inspection {
    private int outCount = 0;
    public int swapCount = 0;
    public int calculationCount = 0;

    public void printComplexity(int aryLength) {
      ++outCount;
      System.out.println(
          this.outCount + ", " + aryLength + " elements, calculationCount = " + this.calculationCount + ", swapCount = "
              + this.swapCount);
      this.swapCount = 0;
      this.calculationCount = 0;
    }
  }

  public static Inspection createInspection() {
    return new Inspection();
  }
}
