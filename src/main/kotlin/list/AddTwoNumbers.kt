package list

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1 = l1
    var l2 = l2
    val l3 = ListNode()
    var curr = l3
    var carry = 0

    while (l1 != null || l2 != null) {
        val sum = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + carry
        carry = sum / 10
        curr.next = ListNode(sum % 10).also { curr = it }
        l1 = l1?.next
        l2 = l2?.next
    }

    if (carry > 0) {
        curr.next = ListNode(carry)
    }

    return l3.next
}
