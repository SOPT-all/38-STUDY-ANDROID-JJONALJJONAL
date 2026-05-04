fun main(args: Array<String>) {
    val s1 = readLine()!!
    var str = ""
    val diff = 'a'-'A'

    for (i in s1) {
        if ( i in 'a'..'z' ) str += i-diff
        else str += i+diff
    }

    println(str)
}