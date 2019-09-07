package algorithm.basic.sort;

import algorithm.annotations.LogExecutionTime;
import org.springframework.stereotype.Component;

@Component
public class HeapSort extends Sort {

  @LogExecutionTime
  @Override
  public int[] sort(int[] target) {

    // Create heap
    for (int i = target.length / 2; i >= 0; i--) {
      // because heapify() affects entire tree, start at the middle position
      this.heapify(target, i, target.length);
    }

    // Dequeue from heap and add at the end
    for (int i = target.length - 1; i > 0; i--) {
      ++this.inspection.swapCount;
      int swapInt = target[0];
      target[0] = target[i];
      this.heapify(target, 0, i);
      target[i] = swapInt;
    }

    return target;
  }

  private void heapify(int[] target, int parentNodeIndex, int maxIndex) {
    int largestIndex = parentNodeIndex;
    int leftIndex = parentNodeIndex * 2 + 1;
    int rightIndex = parentNodeIndex * 2 + 2;

    if (leftIndex < maxIndex && target[largestIndex] < target[leftIndex]) {
      largestIndex = leftIndex;
    }
    ++this.inspection.calculationCount;
    if (rightIndex < maxIndex && target[largestIndex] < target[rightIndex]) {
      largestIndex = rightIndex;
    }
    ++this.inspection.calculationCount;

    if (largestIndex != parentNodeIndex) {
      ++this.inspection.swapCount;
      int swapInt = target[parentNodeIndex];
      target[parentNodeIndex] = target[largestIndex];
      target[largestIndex] = swapInt;

      // Recursively heapify the affected sub-tree
      this.heapify(target, largestIndex, maxIndex);
    }
  }

}
