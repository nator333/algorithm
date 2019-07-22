package algorithm;

import algorithm.amazon.FloodFill;
import algorithm.amazon.FloodFill.Solution;
import algorithm.amazon.LRUCache;
import algorithm.amazon.LongestPalindrome;
import algorithm.amazon.SufficientSubset;
import algorithm.amazon.SufficientSubset.TreeNode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) {
    FloodFill.Solution sol1 = new FloodFill.Solution();
    //int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
    int[][] image = {{0,0,0},{0,9,9}};
    image = sol1.floodFill(image, 1, 1, 1);
    FloodFill.print(image);

//    SufficientSubset.Solution sol2 = new SufficientSubset.Solution();
//    TreeNode dd = {1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14};
//    int limit = 1;
//    sol2.sufficientSubset(dd, limit);

    System.out.println("================");
    LRUCache cache = new LRUCache( 2 /* capacity */ );
    cache.put(1, 1);
    cache.put(2, 2);
    System.out.println(cache.get(1));       // returns 1
    cache.put(3, 3);    // evicts key 2
    System.out.println(cache.get(2));       // returns -1 (not found)
    cache.put(4, 4);    // evicts key 1
    System.out.println(cache.get(1)); // returns -1 (not found)
    System.out.println(cache.get(3)); // returns 3
    System.out.println(cache.get(4)); // returns 4

    LongestPalindrome.Solution sol4 = new LongestPalindrome.Solution();
    System.out.println(sol4.longestPalindrome("babad"));


  }
}