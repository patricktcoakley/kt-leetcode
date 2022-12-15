package list

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.equality.shouldBeEqualToComparingFields
import io.kotest.matchers.shouldBe

class ListNodeKtTest : DescribeSpec({
    describe("listNodeOf") {
        it("should return null when given no args") {
            val res = listNodeOf()

            res shouldBe null
        }

        it("should return a valid ListNode when given args") {
            val res = listNodeOf(1,2,3)
            val expected = ListNode(1).apply { next = ListNode(2).apply { next = ListNode(3) }}

            res?.shouldBeEqualToComparingFields(expected)
        }
    }

    describe("listNodeCycleOf") {
        it("should return null") {
            listNodeCycleOf(0,0) shouldBe null
        }

        it("should return a cyclical ListNode from the last node to the first") {
            val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            val from = 8
            val to = 0
            var res = listNodeCycleOf(from, to, *arr)

            for (i in arr.indices) {
                if (res?.`val` == arr[from]) {
                    res?.next?.`val` shouldBe arr[to]
                }
                res = res?.next
            }
        }
    }
})
