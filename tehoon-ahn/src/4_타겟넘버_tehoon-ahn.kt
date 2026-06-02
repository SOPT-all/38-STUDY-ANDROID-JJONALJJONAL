class Solution4_1 {
    fun solution(numbers: IntArray, target: Int): Int {
       return recSolution(numbers, target, 0, 0)
    }

    private fun recSolution(numbers: IntArray, target: Int, index: Int, current: Int): Int {
        println("인덱스 : ${index}, 현잿값 :  ${current}")
        if(index == numbers.size) {
            return if(current == target) 1 else 0
        }

        val currentNum = numbers[index]

        val addCase = recSolution(numbers, target, index+1, current + currentNum)
        val minusCase = recSolution(numbers, target, index + 1, current - currentNum)

        return addCase + minusCase
    }
}

fun main() {
    val solution = Solution4_1()
    println(solution.solution(intArrayOf(1,1,1), 2))

}
