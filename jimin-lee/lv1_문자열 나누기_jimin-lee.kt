// 1차 풀이 - for문과 index 사용
class Solution {
    fun solution(s: String): Int {
        
        var same = 0
        var diff = 0
        var slice = 0
        var standardChar = s[0]
      
        for (i in 0 until s.length) {
            
            if (s[i] == standardChar) {
                same += 1
            } else {
                diff += 1
            }
            
            if(same == diff) {
                slice += 1
                if (i < s.length-1) {
                    standardChar = s[i+1]
                }
            } else if (same != diff && i == s.length -1){
                slice += 1
            }
        }
        
        return slice
    }
}


// 2차 풀이 - forEach 사용 -> 제일 깔끔한 듯
class Solution {
    fun solution(s: String): Int {
        
        var answer = 0
        var count = 0
        var standardChar: Char = ' '
        
        s.forEach { char -> 
            if (count == 0) {
                answer++
                standardChar = char
            }
            
            if (char == standardChar) {
                count++
            } else {
                count--
            }
        }
      
        return answer
    }
}


// 3차 풀이 - fold 사용
class Solution {
    fun solution(s: String): Int {
        
        var count = 0
        var standardChar: Char = ' '
        
        return s.fold(0) { total, char -> 
            if (count == 0) {
                standardChar = char
                count++
                total + 1
            } else {
                if (char == standardChar) {
                    count++
                } else {
                    count--
                }
                total
            }
        }
    }
}


// 4차 풀이 - fold 사용2 (외부 변수 제거)
class Solution {
    fun solution(s: String): Int {
                
        return s.fold(Triple(0, ' ', 0)) { total, char -> 
            val (answer, standardChar, count) = total
            
            if (count == 0) {
                Triple(answer + 1, char, 1)
            } else {
                Triple(
                    answer, 
                    standardChar, 
                    if (char == standardChar) count + 1 else count - 1
                )
            }
        }.first
    }
}
