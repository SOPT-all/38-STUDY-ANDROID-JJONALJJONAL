class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()
    }
}

// 신기한 코틀린 세계...