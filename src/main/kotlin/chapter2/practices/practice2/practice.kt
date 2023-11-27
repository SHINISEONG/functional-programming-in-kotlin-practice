package chapter2.practices.practice2

val <T> List<T>.tail: List<T>
    get() = drop(1)

val <T> List<T>.head: T
    get() = first()

fun <T> isSorted(list: List<T>, order: (T, T) -> Boolean): Boolean {
    tailrec fun loop(currentList: List<T>): Boolean {
        if (currentList.size <= 1) return true
        if (!order(currentList.head, currentList.tail.head)) return false
        return loop(currentList.tail)
    }
    return loop(list)
}