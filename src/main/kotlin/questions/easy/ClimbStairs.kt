package questions.easy

fun climbStairs(n: Int): Int {
    if (n <= 1) {
        return 1
    }

    var prev = 1
    var curr = 2

    for (i in 2 until n) {
        val t = prev
        prev = curr
        curr += t
    }

    return curr
}
