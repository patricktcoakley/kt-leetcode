package tree

fun isValidBST(root: TreeNode?): Boolean {
    fun isValidNode(node: TreeNode?, high: Int?, low: Int?): Boolean {
        if (node == null) {
            return true
        }
        if (high != null && node.`val` >= high) {
            return false
        }
        return if (low != null && node.`val` <= low) {
            false
        } else isValidNode(node.left, node.`val`, low) && isValidNode(node.right, high, node.`val`)
    }

    return isValidNode(root, null, null)
}

