// ** kotlin에서 String은 immutable **
class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        
        for (i in 0 until my_string.length) {
            if ( i in s until s+overwrite_string.length)
                answer += overwrite_string[i-s]
            else answer += my_string[i]
        }

        return answer
    }
}
