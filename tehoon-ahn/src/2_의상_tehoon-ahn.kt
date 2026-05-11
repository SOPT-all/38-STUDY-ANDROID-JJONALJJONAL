class Solution2_2 {
    fun solution(clothes: Array<Array<String>>): Int {
        // String 값은 key : 옷 종류, Int 값은 value : 종류의 합
        val map = mutableMapOf<String, Int>()
        // map에 들어갈 수 있는 String이며, 순서가 없는것이 특징이라, string (key) 안에 들어간 경우의 수만 구하면 됨
        for(cloth in clothes) {
            var type = cloth[1] //clothes 에 대한 각각의 cloth 종류들을 산출
            map[type] = map.getOrDefault(type, 0) + 1  //만약 map에서 현재 cloth의 종류를 containsKey(옷 종류)라면 추가X, 아니라면 +1
        }
        
        var answer = 1
        for (count in map.values) {
            answer *= (count + 1) //  해당 종류의 의상 수 + 1 곱해줌(일단 안입는 경우도 포함합니당)
        }
        return answer-1 //최종단계에서 안입는 경우를 뺌
    }
}

fun main() {
    val solution = Solution2_2()

    val array: Array<Array<String>> = arrayOf(
        //사실 이중배열의 형태를 띄고 있으나, 사실 각각의 key-value형태 item들을 가진 1차원 array라 볼 수 있음
        arrayOf("blue_coat", "coat"),
        arrayOf("red_coat", "coat"),
        arrayOf("blue_hat", "hat"),
        arrayOf("red_hat", "hat"),
        arrayOf("green_pants", "pants")
    )


    println(solution.solution(array))


}