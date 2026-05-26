class Solution {
    fun solution(word: String): Int {

        var answer = 0
        var count = 0

        val vowels = listOf('A', 'E', 'I', 'O', 'U')

        fun dictionary(char: String) {

            if (char.length > 5) return

            if (char != "") {
                count++
            }

            if (char == word) {
                answer = count
                return
            }

            for (vowel in vowels) {
                dictionary(char + vowel)
            }
        }

        dictionary("")

        return answer
    }
}
