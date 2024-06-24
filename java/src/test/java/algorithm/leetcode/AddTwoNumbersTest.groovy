package algorithm.leetcode

class AddTwoNumbersTest extends GroovyTestCase {
    void testAddTwoNumbers() {
        def addTwoNumbers = new AddTwoNumbers()

        def l1 = new AddTwoNumbers.ListNode(5)
        def l2 = new AddTwoNumbers.ListNode(5)
        def ans = new AddTwoNumbers.ListNode(0)
        ans.next = new AddTwoNumbers.ListNode(1)
        assertEquals(addTwoNumbers.addTwoNumbers(l1, l2), ans)

        l1 = new AddTwoNumbers.ListNode(5)
        l1.next = new AddTwoNumbers.ListNode(1)
        l2 = new AddTwoNumbers.ListNode(7)
        l2.next = new AddTwoNumbers.ListNode(1)
        ans = new AddTwoNumbers.ListNode(2)
        ans.next = new AddTwoNumbers.ListNode(3)
        assertEquals(addTwoNumbers.addTwoNumbers(l1, l2), ans)

        assertEquals(addTwoNumbers.addTwoNumbers(null, l2), l2)

    }
}
