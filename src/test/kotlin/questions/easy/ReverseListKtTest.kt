package questions.easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import list.listNodeOf

class ReverseListKtTest : FunSpec({
    test("example 1") {
        reverseList(listNodeOf(1, 2, 3, 4, 5)) shouldBe listNodeOf(5, 4, 3, 2, 1)
    }

    test("example 2") {
        reverseList(listNodeOf(1, 2)) shouldBe listNodeOf(2, 1)
    }

    test("example 3") {
        reverseList(listNodeOf()) shouldBe listNodeOf()
    }
})
