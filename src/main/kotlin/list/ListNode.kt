package list

 class ListNode(var `val`: Int) {
         var next: ListNode? = null
 }

fun listNodeOf(vararg arr: Int): ListNode? {
    if (arr.isEmpty()) {
        return null
    }

    val dummy = ListNode(0)
    var curr = dummy

    for (v in arr) {
        curr.next = ListNode(v)
        curr = curr.next!!
    }

    return dummy.next
}

fun listNodeCycleOf(cycleFrom: Int, cycleTo: Int, vararg arr: Int): ListNode? {
    if (arr.isEmpty() || cycleFrom < 0 || cycleTo < 0) {
        return null
    }
    val dummy = ListNode(0)
    var curr: ListNode? = dummy
    var from: ListNode? = null
    var to: ListNode? = null

    for ((i, v) in arr.withIndex()) {
        curr?.next = ListNode(v)
        curr = curr?.next

        if (i == cycleTo) {
            to = curr
        }

        if (i == cycleFrom) {
            from = curr
        }
    }

    curr = dummy.next

    while (curr != null) {
        if (curr.`val` == from?.`val`) {
            from.next = to
            break
        }

        curr = curr.next
    }

    return dummy.next
}
