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
    ListNode resultNode = new ListNode(0);
    ListNode currentNode = resultNode;

    while (true) {
      if (l1 == null && l2 == null)
        break;

      int leftInt = 0, rightInt = 0;
      boolean plusOne = false;

      if (l1 != null)
        leftInt = l1.val;
      if (l2 != null)
        rightInt = l2.val;

      int sum = leftInt + rightInt + currentNode.val;
      if (sum >= 10) {
        plusOne = true;
        sum -= 10;
      }

      currentNode.val = sum;
      if (l1 != null)
        l1 = l1.next;

      if (l2 != null)
        l2 = l2.next;

      if (plusOne || l1 != null || l2 != null) {
        currentNode.next = new ListNode(0);
        currentNode = currentNode.next;
        if (plusOne)
          currentNode.val += 1;
      }
    }

    return resultNode;
  }
}
