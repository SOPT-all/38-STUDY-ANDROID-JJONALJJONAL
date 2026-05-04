// 1차 풀이 - for문 사용
class Solution {
    fun solution(citations: IntArray): Int {
        
        val des_citations = citations.sortedDescending()
        var h_index = 0
        
        for (i in des_citations.indices) {
            if(des_citations[i] >= i + 1) {
                h_index = i + 1
            } else {
                break
            }
        }       
        return h_index
    }    
}

// 2차 풀이 - filterIndexed와 size 사용 -> 조건에 맞는 value만 남긴 후 해당 리스트의 사이즈 반환
class Solution2 {
    fun solution(citations: IntArray): Int {
        
        return citations
            .sortedDescending()
            .filterIndexed { index, value ->
                value >= index + 1
            }
            .size
    }
}
