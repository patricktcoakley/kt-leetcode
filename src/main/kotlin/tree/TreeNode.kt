package tree

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun treeNodeOf(vararg nums: Int?): TreeNode? {
    if (nums.isEmpty()) {
        return null
    }

    val root = TreeNode(nums.first()!!)
    val queue = ArrayDeque<TreeNode?>().apply { addFirst(root) }
    var index = 1
    val n = nums.size
    while (queue.isNotEmpty() && index < n) {
        val top = queue.removeFirst()

        if (top != null) {
            nums[index]?.let {
                top.left = TreeNode(it)
            }

            queue.addLast(top.left)
            index += 1

            if (index >= n) {
                break
            }
            nums[index]?.let {
                top.right = TreeNode(it)
            }
            queue.addLast(top.right)
            index += 1
        }
    }

    return root
}
