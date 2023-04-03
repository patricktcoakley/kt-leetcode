package string

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IsPalindromeKtTest : FunSpec({
    test("example 1") {
        isPalindrome("A man, a plan, a canal: Panama") shouldBe true
    }

    test("example 2") {
        isPalindrome("race a car") shouldBe false
    }

    test("example 3") {
        isPalindrome(" ") shouldBe true
    }
})
