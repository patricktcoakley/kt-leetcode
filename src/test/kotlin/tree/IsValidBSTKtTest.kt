package tree

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IsValidBSTKtTest : FunSpec({
    test("example 1") {
        val root = treeNodeOf(2, 1, 3)
        isValidBST(root) shouldBe true
    }

    test("example 2") {
        val root = treeNodeOf(5, 1, 4, null, null, 3, 62)
        isValidBST(root) shouldBe false
    }
})
