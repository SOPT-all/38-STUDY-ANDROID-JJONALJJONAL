class Solution {
    fun solution(numbers: IntArray): String {
    val sorted = numbers
        .map { it.toString() }
        .sortedWith { a, b ->
            (b + a).compareTo(a + b)
        }

    if (sorted[0] == "0") return "0"

    return sorted.joinToString("")
}
}