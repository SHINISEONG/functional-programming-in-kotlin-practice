package chapter2

fun <T> findFirst(array: Array<T>, fn: (T) -> Boolean ): Int {
    tailrec fun loop(n: Int): Int =
        when {
            n >= array.size -> -1
            fn(array[n]) -> n
            else -> loop(n + 1)
        }
    return loop(0)
}

fun <T> findFirst(array: Array<T>, key: T): Int {
    tailrec fun loop(n: Int): Int =
        when {
            n >= array.size -> -1
            array[n] == key -> n
            else -> loop(n + 1)
        }
    return loop(0)
}