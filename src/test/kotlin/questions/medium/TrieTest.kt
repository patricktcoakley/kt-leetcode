package questions.medium

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TrieTest : FunSpec({
    test("example") {
        val trie = Trie()
        trie.insert("apple")
        trie.search("apple") shouldBe true
        trie.search("app") shouldBe false
        trie.startsWith("app") shouldBe true
        trie.insert("app")
        trie.search("app") shouldBe true
    }
})
