fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println("%d + %d = %d".format(a, b, a+b))
}

// 문자열 포맷팅은 .format 통해서!