package questions.easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.equality.shouldBeEqualToComparingFields
import io.kotest.matchers.shouldBe
import tree.treeNodeOf
import kotlin.test.assertNotNull

class InvertTreeKtTest : FunSpec({
    test("example 1") {
        val result = invertTree(treeNodeOf(4, 2, 7, 1, 3, 6, 9))
        val expected = treeNodeOf(4, 7, 2, 9, 6, 3, 1)

        assertNotNull(result).apply {
            shouldBeEqualToComparingFields(expected!!)
        }
    }

    test("example 2") {
        val result = invertTree(treeNodeOf(2, 1, 3))
        val expected = treeNodeOf(2, 3, 1)

        assertNotNull(result).apply {
            shouldBeEqualToComparingFields(expected!!)
        }
    }

    test("example 3") {
        invertTree(null) shouldBe null
    }
})
