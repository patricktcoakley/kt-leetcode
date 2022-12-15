package easy

import kotlin.math.max
import kotlin.math.min

fun maxProfit(prices: IntArray): Int {
    var lo = Int.MAX_VALUE
    var hi = 0

    for (price in prices) {
        lo = min(lo, price)
        hi = max(hi, price - lo)
    }
    return hi
}
