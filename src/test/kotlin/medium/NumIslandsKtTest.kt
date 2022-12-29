package medium

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NumIslandsKtTest : FunSpec({
    test("example 1") {
        val input = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0')
        )

        numIslands(input) shouldBe 1
    }

    test("example 2") {
        val input = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )

        numIslands(input) shouldBe 3
    }
})
