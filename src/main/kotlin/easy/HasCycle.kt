package easy

import list.ListNode

fun hasCycle(head: ListNode?): Boolean {
    if (head == null) {
        return false
    }

    var slow = head
    var fast = head.next

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next

        if (slow == fast) {
            return true
        }
    }

    return false
}
