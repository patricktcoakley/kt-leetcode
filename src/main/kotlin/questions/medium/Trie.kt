package questions.medium

private class TrieNode {
    private val children = HashMap<Char, TrieNode>()
    var isTerminal = false

    operator fun contains(c: Char): Boolean = c in children
    operator fun get(c: Char): TrieNode? = children[c]
    operator fun set(c: Char, t: TrieNode) {
        children[c] = t
    }
}

class Trie {
    private val head = TrieNode()

    fun insert(word: String) {
        var curr = head

        for (c in word) {
            if (c !in curr) {
                curr[c] = TrieNode()
            }

            curr = curr[c]!!
        }

        curr.isTerminal = true
    }

    private fun searchPrefix(prefix: String): TrieNode? {
        var curr: TrieNode = head

        for (c in prefix) {
            curr = curr[c] ?: return null
        }

        return curr
    }

    fun search(word: String): Boolean = searchPrefix(word)?.isTerminal ?: false
    fun startsWith(prefix: String): Boolean = searchPrefix(prefix) != null
}
