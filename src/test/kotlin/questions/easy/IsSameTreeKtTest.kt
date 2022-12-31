package questions.easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import tree.treeNodeOf

class IsSameTreeKtTest : FunSpec({
    test("example 1") {
        val p = treeNodeOf(1, 2, 3)
        val q = treeNodeOf(1, 2, 3)
        isSameTree(p, q) shouldBe true
    }

    test("example 2") {
        val p = treeNodeOf(1, 2)
        val q = treeNodeOf(1, null, 2)
        isSameTree(p, q) shouldBe false
    }

    test("example 3") {
        val p = treeNodeOf(1, 2, 1)
        val q = treeNodeOf(1, 1, 2)
        isSameTree(p, q) shouldBe false
    }
})
