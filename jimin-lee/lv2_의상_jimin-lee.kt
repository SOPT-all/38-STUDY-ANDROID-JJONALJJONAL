class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        
        val typeCountMap = mutableMapOf<String, Int>()
        
        for (i in clothes){
            val type = i[1]
            typeCountMap[type] = typeCountMap.getOrDefault(type,0)+1
        }
        
        var answer = 1
        
        for (i in typeCountMap.values) {
            answer = (i+1) * answer
        }
        
        return answer - 1
    }
}
