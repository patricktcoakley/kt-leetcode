package questions.easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IsValidKtTest : FunSpec({
    test("example 1") {
        isValid("()") shouldBe true
    }

    test("example 2") {
        isValid("()[]{}") shouldBe true
    }

    test("example 3") {
        isValid("(]") shouldBe false
    }
})
