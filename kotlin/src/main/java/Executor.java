public class Executor {

  public static void main(String[] args) {
    LinkedListCycle.Solution sol = new LinkedListCycle.Solution();
    LinkedListCycle.ListNode node = new LinkedListCycle.ListNode(1);
    node.next = new LinkedListCycle.ListNode(2);
    System.out.println(sol.hasCycle(node));

  }
}
