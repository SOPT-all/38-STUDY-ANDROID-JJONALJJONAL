class Solution3_1 {
    fun solution(record: Array<String>): Array<String> {
        //최종적으로 id가 가진 닉네임이 무엇인지를 저장하기 위해 Map을 사용해 저장
        var tempMap = mutableMapOf<String, String>()

        // 1. 유저 id를 식별하고 각 유저들이 최종적으로 가진 닉네임이 무엇인지를 순회하여 결정
        for(item in record) {
            val temp = item.split(" ")
            if(temp[0].length in 1..10 && temp[1].length in 1..10) {
                when(temp[0]) {
                    "Enter" -> tempMap[temp[1]] = temp[2]
                    "Change" -> if(tempMap.containsKey(temp[1])) tempMap[temp[1]] = temp[2]
                }
            }
        }

        // 2. 넣어둔 유저 id를 기반으로한 닉네임들로 answer에 최종적으로 채팅방 로그(answer)를 생성
        var answer = mutableListOf<String>()
        for(item in record) {
            val temp = item.split(" ")
            println(temp.toString())
            when(temp[0]) {
                "Enter" -> answer.add("${tempMap[temp[1]]}님이 들어왔습니다.")
                "Leave" -> answer.add("${tempMap[temp[1]]}님이 나갔습니다.")
            }
        }
        return answer.toTypedArray()
    }
}

fun main() {
    val solution = Solution3_1()

    val array = arrayOf("Enter test1 tehoon", "Change test1 hoonte", "Enter test2 hoonte", "Enter test3 th", "Leave test1", "Change test2 tehoon")

    println(solution.solution(array).contentToString())
}