package easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IsAnagramKtTest : FunSpec({
    test("example 1") {
        isAnagram("anagram", "nagaram") shouldBe true
    }

    test("example 2") {
        isAnagram("rat", "car") shouldBe false
    }
})
