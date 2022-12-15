package easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import list.listNodeCycleOf

class HasCycleKtTest : FunSpec({
    test("example 1") {
        hasCycle(listNodeCycleOf(cycleFrom = 3, cycleTo = 1, 3, 2, 0, -4)) shouldBe true
    }

    test("example 2") {
        hasCycle(listNodeCycleOf(cycleFrom = 1, cycleTo = 0, 1, 2)) shouldBe true
    }

    test("example 3") {
        hasCycle(listNodeCycleOf(cycleFrom = -1, cycleTo = -1, 1)) shouldBe false
    }
})
