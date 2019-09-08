package algorithm.leetcode;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    // [1,8,6,2,5,4,8,3,7]
    int left = 0, right = height.length - 1;
    int max = 0;
    while (left < height.length - 1) {
      int heightAdopted = Math.min(height[left], height[right]);
      int body = heightAdopted * (right - left);
      max = Math.max(max, body);
      if (heightAdopted == height[left]) {
        ++left;
        right = height.length - 1;
      } else {
        --right;
      }
    }
    return max;
  }
}
