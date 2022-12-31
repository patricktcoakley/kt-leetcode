package questions.easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ContainsDuplicateKtTest : FunSpec({
    test("example 1") {
        containsDuplicate(intArrayOf(1, 2, 3, 1)) shouldBe true
    }

    test("example 2") {
        containsDuplicate(intArrayOf(1, 2, 3, 4)) shouldBe false
    }

    test("example 3") {
        containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) shouldBe true
    }

})
