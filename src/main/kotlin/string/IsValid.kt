package string

fun isValid(s: String): Boolean {
    val chars = hashMapOf(
        '}' to '{',
        ')' to '(',
        ']' to '['
    )

    val stack = ArrayDeque<Char>()

    for (c in s) {
        if (!chars.containsKey(c)) {
            stack.add(c)
        } else {
            if (stack.isEmpty() || stack.removeLast() != chars[c]) {
                return false
            }
        }
    }

    return stack.isEmpty()
}
