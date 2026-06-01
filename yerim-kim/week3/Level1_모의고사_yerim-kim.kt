class Solution {

    val patterns = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
        intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
    )

    fun solution(answers: IntArray): IntArray {
        val scores = IntArray(3)

        for (i in 0 until answers.size) {
            for (j in 0 until patterns.size) {
                if (answers[i] == patterns[j][i % patterns[j].size]) {
                    scores[j] ++
                }
            }
        }

        val maxScore = scores.maxOrNull()
        val result = IntArray(scores.count { it == maxScore })

        var indx = 0

        for (i in 0 until scores.size) {
            if (scores[i] == maxScore) {
                result[indx++] = i + 1
            }
        }

        return result
    }
}
