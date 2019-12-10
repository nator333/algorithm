package algorithm.leetcode;

public class AddTwoNumbers {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof ListNode)) {
        return false;
      }
      ListNode other = (ListNode)obj;

      ListNode l1 = this;
      ListNode l2 = other;

      while (true) {
        if (l1 == null && l2 == null) {
          return true;
        } else if (l1 == null || l2 == null) {
          return false;
        }

        if (l1.val != l2.val) {
          return false;
        }

        l1 = l1.next;
        l2 = l2.next;
      }
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return null;
  }
}
