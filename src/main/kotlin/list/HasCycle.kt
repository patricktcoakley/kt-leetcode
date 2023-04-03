package list

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head?.next
    while (slow != null && fast?.next != null) {
        slow = slow.next
        fast = fast.next?.next

        if (slow == fast) {
            return true
        }
    }

    return false
}
