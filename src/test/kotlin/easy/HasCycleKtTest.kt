package easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import list.listNodeCycleOf

class HasCycleKtTest : FunSpec({
    test("example 1") {
        val arr = intArrayOf(3, 2, 0, -4)
        val input = listNodeCycleOf(cycleFrom = 3, cycleTo = 1, *arr)
        hasCycle(input) shouldBe true
    }

    test("example 2") {
        val arr = intArrayOf(1, 2)
        val input = listNodeCycleOf(cycleFrom = 1, cycleTo = 0, *arr)
        hasCycle(input) shouldBe true
    }

    test("example 3") {
        hasCycle(listNodeCycleOf(cycleFrom = -1, cycleTo = -1, 1)) shouldBe false
    }
})
