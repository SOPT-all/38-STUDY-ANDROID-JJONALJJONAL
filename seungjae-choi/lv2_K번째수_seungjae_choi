class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            val i = command[0]
            val j = command[1]
            val k = command[2]
            
            array.sliceArray(i - 1 until j).sortedArray()[k - 1]
        }.toIntArray()
    }
}
