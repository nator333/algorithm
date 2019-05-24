import java.util.*

class AddTwoNumbers {
  class ListNode(var `val`: Int) {
    var next: ListNode? = null
    
    constructor(num: Int, nextNode: ListNode) : this(num) {
      this.next = nextNode
    }
    
    constructor(ary: Array<Int>) : this(ary[0]) {
      val queue = LinkedList<Int>()
      queue.addAll(ary)
      queue.pop()
      
      var size = ary.size
      var child: ListNode? = null
      
      while (size > 1) {
        when {
          this.next == null -> {
            this.next = ListNode(queue.pop())
            child = this.next
          }
          else -> {
            child!!.next = ListNode(queue.pop())
            child = child.next
          }
        }
        size -= 1
      }
      
      println(this)
    }
    
    override fun equals(other: Any?): Boolean {
      if (this === other) return true
      if (javaClass != other?.javaClass) return false
      
      other as ListNode
      
      if (`val` != other.`val`) return false
      if (next != other.next) return false
      
      return true
    }
    
    override fun hashCode(): Int {
      var result = `val`
      result = 31 * result + (next?.hashCode() ?: 0)
      return result
    }
    
    override fun toString(): String {
      return "`val` = $`val`, ${next?.toString()}"
    }
    
    
  }
  
  fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) return l2
    if (l2 == null) return l1
  
    var detectDepthNode: ListNode? = l1
    var detectDepthNode2: ListNode? = l2
  
    val resultNode : ListNode
    var processBaseNode: ListNode?
    var plusNode: ListNode?
    
    while (true) {
      detectDepthNode = detectDepthNode?.next
      detectDepthNode2 = detectDepthNode2?.next
      
      if (detectDepthNode == null || detectDepthNode2 == null) {
        if (detectDepthNode == null) {
          resultNode = l1
          processBaseNode = l1
          plusNode = l2
        } else {
          resultNode = l2
          processBaseNode = l2
          plusNode = l1
        }
        break
      }
    }
    
    var moreThanTen = false
    while (plusNode != null || moreThanTen) {
      var sum = if (moreThanTen) 1 else 0
      if (processBaseNode != null) sum += processBaseNode.`val`
      if (plusNode != null) sum += plusNode.`val`
      if (sum > 9) {
        sum -= 10
        moreThanTen = true
      } else {
        moreThanTen = false
      }
  
      processBaseNode?.`val` = sum
      plusNode = plusNode?.next
      
      if (processBaseNode?.next == null && moreThanTen) {
        processBaseNode?.next = ListNode(0)
      }
      
      processBaseNode = processBaseNode?.next
      
    }
    
    return resultNode
  }
}