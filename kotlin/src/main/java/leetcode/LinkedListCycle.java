package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
class LinkedListCycle {

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  /**
   * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) {
   * val = x; next = null; } }
   */
  static class Solution {

    boolean hasCycle(ListNode head) {
      Set<ListNode> set = new HashSet<>();
      ListNode willBeAdded = head;
      while (willBeAdded != null) {
        if (set.contains(willBeAdded)) {
          return true;
        } else {
          set.add(willBeAdded);
        }
        willBeAdded = willBeAdded.next;
      }

      return false;
    }
  }
}
