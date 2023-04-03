package tree

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MaxDepthKtTest : FunSpec({
    test("example 1") {
        val root = treeNodeOf(3, 9, 20, null, null, 15, 7)
        val result = maxDepth(root)
        result shouldBe 3
    }

    test("example 2") {
        val root = treeNodeOf(1, null, 2)
        val result = maxDepth(root)
        result shouldBe 2
    }
})
