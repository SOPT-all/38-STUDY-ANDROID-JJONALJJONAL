fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    
    if (a % 2 == 1) println("%d is odd".format(a))
    else println("%d is even".format(a))
}

// if (a%2) 불가능
// -> 자동 형변환이 안돼서 Int로 남아있기 때문에 ㅠㅠ!