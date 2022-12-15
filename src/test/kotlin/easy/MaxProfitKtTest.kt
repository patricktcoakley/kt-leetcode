package easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MaxProfitKtTest : FunSpec({
    test("example 1") {
        maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)) shouldBe 5
    }

    test("example 2") {
        maxProfit(intArrayOf(7, 6, 4, 3, 1)) shouldBe 0
    }
})
