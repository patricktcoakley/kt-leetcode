package tree

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) {
        return null
    }

    val left = invertTree(root.left)
    val right = invertTree(root.right)
    root.right = left
    root.left = right

    return root
}
