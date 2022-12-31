package questions.easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ClimbStairsKtTest : FunSpec({
    test("example 1") {
        climbStairs(2) shouldBe 2
    }

    test("example 2") {
        climbStairs(3) shouldBe 3

    }
})
