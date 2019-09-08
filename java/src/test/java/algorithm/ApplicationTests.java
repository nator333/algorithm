package algorithm;

import algorithm.basic.search.BinarySearchTest;
import algorithm.basic.search.LinearSearchTest;
import algorithm.basic.sort.BubbleSortTest;
import algorithm.basic.sort.HeapSortTest;
import algorithm.basic.sort.InsertionSortTest;
import algorithm.basic.sort.MergeSortTest;
import algorithm.basic.sort.QuickSortTest;
import algorithm.basic.sort.SelectionSortTest;
import algorithm.leetcode.AddTwoNumbersTest;
import algorithm.leetcode.ContainerWithMostWaterTest;
import algorithm.leetcode.LengthOfLongestSubstringTest;
import algorithm.leetcode.RegularExpressionMatchingTest;
import algorithm.leetcode.ReverseIntegerTest;
import algorithm.leetcode.RomanToIntegerTest;
import algorithm.leetcode.StringToIntegerTest;
import algorithm.leetcode.TwoSomeTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
  @Autowired
  private BubbleSortTest bubbleSortTest;
  @Autowired
  private SelectionSortTest selectionSortTest;
  @Autowired
  private InsertionSortTest insertionSortTest;
  @Autowired
  private HeapSortTest heapSortTest;
  @Autowired
  private MergeSortTest mergeSortTest;
  @Autowired
  private QuickSortTest quickSortTest;

  @Test
  public void leetcodeTest() {
    new TwoSomeTest().test();
    new AddTwoNumbersTest().testAddTwoNumbers();
    new LengthOfLongestSubstringTest().testLengthOfLongestSubstring();
    new ReverseIntegerTest().testReverse();
    new StringToIntegerTest().testMyAtoi();
    //new RegularExpressionMatchingTest().testIsMatch();
    new ContainerWithMostWaterTest().testMaxArea();
    new RomanToIntegerTest().testRomanToInt();
  }

  @Test
  public void searchTest() {
    new LinearSearchTest().testSearch();
    new BinarySearchTest().testSearch();
  }

  @Test
  public void sortTest() {
    this.bubbleSortTest.testSort();
    this.bubbleSortTest.testImprovedSort();
    this.selectionSortTest.testSort();
    this.insertionSortTest.testSort();
    this.heapSortTest.testSort();
    this.mergeSortTest.testSort();
    this.quickSortTest.testSort();
  }



}