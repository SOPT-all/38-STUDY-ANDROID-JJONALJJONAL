class Solution3_2 {
    fun solution(answers: IntArray): IntArray {
        //각 수포자들의 찍기 패턴 정의
        val patterns = listOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )

        // map과 filterIndexed를 사용해 코틀린스럽게 scores 내부를 얼마나 맞췄는지에 대한 값들을 채워줌
        var scores = patterns.map { pattern ->
            answers.filterIndexed { index, answer ->
                answer == pattern[index % pattern.size]
            }.size
        }

        // 그중 가장높은 값을 지정
        val maxScore = scores.maxOrNull()


        return scores.mapIndexedNotNull { index, score ->
            if (score == maxScore) index + 1 else null
        }.toIntArray()
    }
}

fun main() {
    val solution = Solution3_2()
    println(solution.solution(intArrayOf(1, 4,5,4,5,5,5,3,2,5,3,4,5,3,2,1,5,5,5,3,2,5,2,1,3,3)))

}