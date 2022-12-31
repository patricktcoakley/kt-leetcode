package questions.easy

import tree.TreeNode

fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    fun isSame(lhs: TreeNode?, rhs: TreeNode?): Boolean {
        if (lhs == null && rhs == null) {
            return true
        }

        if ((lhs == null || rhs == null) || lhs.`val` != rhs.`val`) {
            return false
        }

        return isSame(lhs.left, rhs.left) && isSame(lhs.right, rhs.right)
    }

    if (root == null) {
        return false
    }

    if (isSame(root, subRoot)) {
        return true
    }

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
}
