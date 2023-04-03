package string

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val m = HashMap<Char, Int>()
    for (i in s.indices) {
        m[s[i]] = m.getOrDefault(s[i], 0) + 1
        m[t[i]] = m.getOrDefault(t[i], 0) - 1
    }

    return m.values.all { it == 0 }
}
