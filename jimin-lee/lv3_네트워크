class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val visited = BooleanArray(n)
        var answer = 0

        fun dfs(current: Int) {
            visited[current] = true

            for (next in 0 until n) {
                val isConnected = computers[current][next] == 1
                if (isConnected && !visited[next]) {
                    dfs(next)
                }
            }
        }

        for (computer in 0 until n) {
            if (!visited[computer]) {
                answer++
                dfs(computer)
            }
        }

        return answer
    }
}
