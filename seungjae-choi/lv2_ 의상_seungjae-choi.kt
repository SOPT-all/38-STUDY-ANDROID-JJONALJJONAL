class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val counts = HashMap<String, Int>()
        
        for (cloth in clothes) {
            val type = cloth[1]
            counts[type] = counts.getOrDefault(type, 0) + 1
        }
        
        var answer = 1
        
        for (count in counts.values) {
            answer *= (count + 1)
        }
        
        return answer - 1
    }
}
