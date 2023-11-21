package chapter2
fun fib(i: Int): Int {
    tailrec fun go(i: Int, n: Int = 0, m: Int = 1): Int {
        return if (i == 1) n
        else go(i - 1, m, n + m)
    }
    return go(i)
}
fun fibSequence(i: Int): List<Int> {
    return (1..i).map { fib(it) }
}
fun main() {

}