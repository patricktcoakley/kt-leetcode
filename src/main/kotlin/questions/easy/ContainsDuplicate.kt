package questions.easy

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.toSet().size != nums.size
}
