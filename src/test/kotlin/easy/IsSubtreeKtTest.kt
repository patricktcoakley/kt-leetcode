package easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import tree.treeNodeOf

class IsSubtreeKtTest : FunSpec({
    test("example 1") {
        val root = treeNodeOf(3, 4, 5, 1, 2)
        val subRoot = treeNodeOf(4, 1, 2)
        isSubtree(root, subRoot) shouldBe true
    }

    test("example 2") {
        val root = treeNodeOf(3, 4, 5, 1, 2, null, null, null, null, 0)
        val subRoot = treeNodeOf(4, 1, 2)
        isSubtree(root, subRoot) shouldBe false
    }
})
