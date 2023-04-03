package array

fun rotate(matrix: Array<IntArray>): Unit {
    for (i in matrix.indices) {
        for (j in i until matrix.size) {
            val t = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = t
        }
    }

    matrix.map { it.reverse() }
}
