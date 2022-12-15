package easy

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val m = HashMap<Char, Int>()
    s.forEach { m[it] = m.getOrDefault(it, 0) + 1 }
    t.forEach { m[it] = m.getOrDefault(it, 0) - 1 }
    return m.values.all { it == 0 }
}
