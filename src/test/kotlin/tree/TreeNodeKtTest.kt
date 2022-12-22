package tree

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.equality.shouldBeEqualToComparingFields
import io.kotest.matchers.shouldBe
import kotlin.test.assertNotNull

class TreeNodeKtTest : FunSpec({
    test("empty") {
        treeNodeOf() shouldBe null
    }

    test("one") {
        val result = treeNodeOf(1)
        assertNotNull(result).apply {
            shouldBeEqualToComparingFields(TreeNode(1))
        }
    }

    test("two") {
        val expected = TreeNode(1).apply {
            left = TreeNode(2)
        }

        val result = treeNodeOf(1, 2)

        assertNotNull(result).apply {
            shouldBeEqualToComparingFields(expected)
        }
    }

    test("three") {
        val expected = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        val result = treeNodeOf(1, 2, 3)

        assertNotNull(result).apply {
            shouldBeEqualToComparingFields(expected)
        }
    }

    test("many") {
        val expected = TreeNode(4).apply {
            left = TreeNode(2).also { left ->
                left.left = TreeNode(1)
                left.right = TreeNode(3)
            }
            right = TreeNode(7).also { right ->
                right.left = TreeNode(6)
                right.right = TreeNode(9)
            }
        }

        val result = treeNodeOf(4, 2, 7, 1, 3, 6, 9)

        assertNotNull(result).apply {
            shouldBeEqualToComparingFields(expected)
        }
    }

    test("with nulls") {
        val expected = TreeNode(1).apply {
            right = TreeNode(2).also { right ->
                right.left = TreeNode(3)
            }
        }

        val result = treeNodeOf(1, null, 2, 3)
        
        assertNotNull(result).apply {
            shouldBeEqualToComparingFields(expected)
        }
    }
})
