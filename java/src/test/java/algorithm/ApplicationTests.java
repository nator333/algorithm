package algorithm;

import algorithm.basic.search.BinarySearchTest;
import algorithm.basic.search.LinearSearchTest;
import algorithm.basic.sort.BubbleSortTest;
import algorithm.basic.sort.HeapSortTest;
import algorithm.basic.sort.InsertionSortTest;
import algorithm.basic.sort.MergeSortTest;
import algorithm.basic.sort.QuickSortTest;
import algorithm.basic.sort.SelectionSortTest;
import algorithm.leetcode.AddTwoNumbers;
import algorithm.leetcode.AddTwoNumbersTest;
import algorithm.leetcode.LengthOfLongestSubstringTest;
import algorithm.leetcode.ReverseInteger;
import algorithm.leetcode.ReverseIntegerTest;
import algorithm.leetcode.StringToIntegerTest;
import algorithm.leetcode.TwoSomeTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

  @Test
  public void leetcodeTest() {
    new TwoSomeTest().test();
    new AddTwoNumbersTest().testAddTwoNumbers();
    new LengthOfLongestSubstringTest().testLengthOfLongestSubstring();
    new ReverseIntegerTest().testReverse();
    new StringToIntegerTest().testMyAtoi();
  }

  @Test
  public void searchTest() {
    new LinearSearchTest().testSearch();
    new BinarySearchTest().testSearch();
  }

  @Test
  public void sortTest() {
    new BubbleSortTest().testSort();
    new BubbleSortTest().testImprovedSort();
    new SelectionSortTest().testSort();
    new InsertionSortTest().testSort();
    new HeapSortTest().testSort();
    new MergeSortTest().testSort();
    new QuickSortTest().testSort();
  }



}