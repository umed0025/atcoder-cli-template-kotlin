fun main(args: Array<String>) {
    var lines = mutableListOf<String>()
    var line: String?
    while (readLine().also { line = it } != null) {
        lines.add(line!!)
    }
    val a = lines[0]!!.toInt()
    val (b, c) = lines[1]!!.split(" ").map { it.toInt() }
    val s = lines[2]!!
    print((a + b + c).toString() + " " + s)
    println()
}
