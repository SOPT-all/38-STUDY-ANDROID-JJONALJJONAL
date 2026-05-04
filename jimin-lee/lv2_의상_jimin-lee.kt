class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        
        val map = mutableMapOf<String, Int>()
        
        for (i in clothes){
            val type = i[1]
            map[type] = map.getOrDefault(type,0)+1
        }
        
        var answer = 1
        
        for (i in map.values) {
            answer = (i+1) * answer
        }
        
        return answer - 1
    }
}
