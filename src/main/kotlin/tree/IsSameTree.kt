package tree

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    when {
        p == null && q == null -> {
            return true
        }

        p == null || q == null || p.`val` != q.`val` -> {
            return false
        }

        else -> return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }

}
