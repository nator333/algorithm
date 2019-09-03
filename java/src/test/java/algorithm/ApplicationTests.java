package algorithm;

import algorithm.basic.sort.BubbleSortTest;
import algorithm.basic.sort.HeapSortTest;
import algorithm.basic.sort.InsertionSortTest;
import algorithm.basic.sort.MergeSortTest;
import algorithm.basic.sort.QuickSortTest;
import algorithm.basic.sort.SelectionSortTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

  @Test
  public void contextLoads() {
    this.sortTest();
  }

  private void sortTest() {
    new BubbleSortTest().testSort();
    new BubbleSortTest().testImprovedSort();
    new SelectionSortTest().testSort();
    new InsertionSortTest().testSort();
    new HeapSortTest().testSort();
    new MergeSortTest().testSort();
    new QuickSortTest().testSort();
  }

}