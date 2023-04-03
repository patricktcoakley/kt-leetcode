package list

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AddTwoNumbersKtTest : FunSpec({
    test("example 1") {
        val l1 = listNodeOf(2, 4, 3)
        val l2 = listNodeOf(5, 6, 4)
        val expected = listNodeOf(7, 0, 8)
        addTwoNumbers(l1, l2) shouldBe expected
    }

    test("example 2") {
        val l1 = listNodeOf(0)
        val l2 = listNodeOf(0)
        val expected = listNodeOf(0)
        addTwoNumbers(l1, l2) shouldBe expected
    }

    test("example 3") {
        val l1 = listNodeOf(9, 9, 9, 9, 9, 9, 9)
        val l2 = listNodeOf(9, 9, 9, 9)
        val expected = listNodeOf(8, 9, 9, 9, 0, 0, 0, 1)
        addTwoNumbers(l1, l2) shouldBe expected
    }
})
