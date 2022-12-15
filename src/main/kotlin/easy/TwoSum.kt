package easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    val m = HashMap<Int, Int>()
    
    for (i in 0..nums.size) {
        val diff = target - nums[i]

        m[diff]?.let {
            return intArrayOf(i, it)
        }

        m[nums[i]] = i
    }
    return intArrayOf(0)
}
