package chapter2.examples.list3


fun findFirst(strings: Array<String>, key: String): Int {
    tailrec fun loop(n: Int): Int =
        when {
            n >= strings.size -> -1
            strings[n] == key -> n
            else -> loop(n + 1)
        }
    return loop(0)
}