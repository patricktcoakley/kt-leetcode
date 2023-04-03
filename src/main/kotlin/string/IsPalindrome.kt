package string

fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1

    while (left < right) {
        var a = s[left]
        var b = s[right]

        while (left < right && !a.isLetterOrDigit()) {
            left += 1
            a = s[left]
        }

        while (left < right && !b.isLetterOrDigit()) {
            right -= 1
            b = s[right]
        }

        if (a.lowercaseChar() != b.lowercaseChar()) {
            return false
        }

        left += 1
        right -= 1

    }

    return true
}
