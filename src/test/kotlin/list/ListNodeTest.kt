package list

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.equality.shouldBeEqualToComparingFields
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class ListNodeTest : DescribeSpec({
    describe("listNodeOf") {
        it("should return null when given no args") {
            val res = listNodeOf()

            res shouldBe null
        }

        it("should return a valid ListNode when given args") {
            val res = listNodeOf(1, 2, 3)
            val expected = ListNode(1).apply { next = ListNode(2).apply { next = ListNode(3) } }

            res?.shouldBeEqualToComparingFields(expected)
        }
    }

    describe("listNodeCycleOf") {
        it("should return null") {
            listNodeCycleOf(0, 0) shouldBe null
        }

        it("should return a cyclical ListNode pointing to itself") {
            val from = 0
            val to = 0
            val expected = ListNode(11)
            expected.next = expected
            val result = listNodeCycleOf(cycleFrom = from, cycleTo = to, 11)
            result?.`val` shouldBe expected.`val`
            result?.next?.`val` shouldBe expected.next?.`val`
        }

        it("should return a cyclical ListNode from the last node to the first") {
            val arr = intArrayOf(3, 2, 0, -4)
            val from = arr.lastIndex
            val to = 1
            var expected = listNodeOf(*arr)
            expected?.next?.next?.next?.next = expected?.next
            var result = listNodeCycleOf(cycleFrom = from, cycleTo = to, *arr)

            for (i in arr.indices) {
                result?.`val` shouldBe expected?.`val`
                result = result?.next
                expected = expected?.next
            }
        }
    }

    describe("equals") {
        it("should return true") {
            val lhs = ListNode()
            val rhs = ListNode()

            lhs shouldBe rhs
        }

        it("should return true") {
            val lhs = listNodeOf(1, 2, 3, 4, 5)
            val rhs = listNodeOf(1, 2, 3, 4, 5)

            lhs shouldBe rhs
        }

        it("should return false") {
            val lhs = ListNode()
            val rhs = ListNode(1)

            lhs shouldNotBe rhs
        }

        it("should return false") {
            val lhs = listNodeOf(1, 2, 3, 4, 5)
            val rhs = listNodeOf(5, 4, 3, 2, 1)

            lhs shouldNotBe rhs
        }
    }
})
