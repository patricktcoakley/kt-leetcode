package medium

fun numIslands(grid: Array<CharArray>): Int {
    val rows = grid.size
    val cols = grid[0].size
    var count = 0

    fun dfs(row: Int, col: Int) {
        if (row in 0 until rows && col in 0 until cols && grid[row][col] == '1') {
            grid[row][col] = '0'
            dfs(row + 1, col)
            dfs(row - 1, col)
            dfs(row, col + 1)
            dfs(row, col - 1)
        }
    }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (grid[i][j] == '1') {
                count += 1
                dfs(i, j)
            }
        }
    }

    return count
}
