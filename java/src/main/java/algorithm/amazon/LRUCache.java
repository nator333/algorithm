package algorithm.amazon;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {
  private int capacity;

  public LRUCache(int capacity) {
    // when accessOrder is true, it is sorted by access frequency
    // when it's false (default), sorted by inserted order
    super(capacity, 0.75F, true);
    this.capacity = capacity;
  }

  public int get(int key) {
    return super.getOrDefault(key, -1);
  }

  public void put(int key, int value) {
    super.put(key, value);
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
    return size() > capacity;
  }
}