class Solution2_1 {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer = Array(finished.count { !it }) { "" }
        var count = 0
        for(i in todo_list.indices) {
            if(!finished[i]) answer[count++] = todo_list[i]
        }
        return answer
    }
}

//헐 전화번호 목록이 아니고 할일 목록이었어요 ㅠㅠ ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ 푼거 아까우니까 냅둘게요..,,,..,.,.

fun main() {
    val solution = Solution2_1()

    val array = arrayOf("exercise", "catch", "babo", "chikawa", "love", "running")
    val array2 = booleanArrayOf(true, false, false, false, true, true)


    println(solution.solution(array, array2).contentToString())
}