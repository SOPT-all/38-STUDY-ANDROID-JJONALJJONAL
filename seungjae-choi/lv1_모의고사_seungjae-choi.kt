class Solution {
    fun solution(answers: IntArray): IntArray {
        val p1 = intArrayOf(1, 2, 3, 4, 5)
        val p2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val p3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        
        val scores = intArrayOf(0, 0, 0)
        
        for (i in answers.indices) {
            if (answers[i] == p1[i % p1.size]) scores[0]++
            if (answers[i] == p2[i % p2.size]) scores[1]++
            if (answers[i] == p3[i % p3.size]) scores[2]++
        }
                
        return scores.indices
            .filter { scores[it] == scores.maxOrNull() ?: 0 }
            .map { it + 1 }
            .toIntArray()
    }
}
