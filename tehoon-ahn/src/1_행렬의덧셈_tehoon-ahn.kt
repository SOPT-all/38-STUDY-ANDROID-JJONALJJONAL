import java.util.Scanner

class Solution {
    //arr1 = [1,2] [2,3] arr2 = [3,4] [4,5]
    // 따라서 arr1[i][j] => arr1[0][0] + arr2[0][0] = 1 + 3

    //반대로 arr1 [1][2] arr2 [3][4] = arr1.size = 2 , arr1[0].size = 1
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size) { IntArray(arr1[0].size) }


        for (i in answer.indices) {
            for (j in answer[0].indices) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }

        return answer
    }
}

fun main() {
    val solution = Solution()

    val testArr1 = arrayOf(intArrayOf(1), intArrayOf(2))
    val testArr2 = arrayOf(intArrayOf(3), intArrayOf(4))

    println(solution.solution(testArr1, testArr2).toString())


}

//배운점 1: 프로그래머스(코테환경)에선 막 main함수를 만들고 스캐너를 만들고 할 필요가 없다는 것을 알앗습니다
//      2: 그리고 행렬 오랜만에 하니까 헷갈리네요 ^^ array는 arrayList와 다르게 add가 없어 기본 사이즈 할당이 필요하다는점
//      3: 추가로 행렬은 항상 똑같은 크기의 행렬로 덧셈하기 때문에 굳이 if문으로 arr1, arr2가 다름을 구별할 필요 없다는 점