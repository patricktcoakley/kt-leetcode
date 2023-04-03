package math

fun climbStairs(n: Int): Int {
    if (n <= 1) {
        return 1
    }

    val steps = IntArray(n).also {
        it[0] = 1
        it[1] = 2
    }

    for (i in 2 until n) {
        steps[i] = steps[i - 1] + steps[i - 2]
    }

    return steps[n - 1]
}
