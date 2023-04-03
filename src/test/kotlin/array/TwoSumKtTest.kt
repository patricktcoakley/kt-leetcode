package array

import io.kotest.core.spec.style.FunSpec

class TwoSumKtTest : FunSpec({
    test("example 1") {
        twoSum(intArrayOf(2, 7, 11, 15), 9) contentEquals (intArrayOf(1, 0))
    }

    test("example 2") {
        twoSum(intArrayOf(3, 2, 4), 6) contentEquals (intArrayOf(1, 2))
    }

    test("example 3") {
        twoSum(intArrayOf(3, 3), 6) contentEquals (intArrayOf(1, 0))
    }
})
