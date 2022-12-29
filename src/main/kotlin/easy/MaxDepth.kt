package easy

import tree.TreeNode

fun maxDepth(root: TreeNode?): Int {
    return if (root == null) {
        0
    } else {
        maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
    }
}
