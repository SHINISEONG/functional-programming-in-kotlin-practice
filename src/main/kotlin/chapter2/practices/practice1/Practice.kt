package chapter2.practices.practice1
fun fib(n: Int): Int {
    tailrec fun go(n: Int, curr: Int = 0, next: Int = 1): Int {
        return if (n == 0) curr
        else go(n - 1, next, curr + next)
    }
    return go(n)
}
fun fibSequence(i: Int): List<Int> {
    return (1..i).map { fib(it) }
}

fun formatResult(name: String, n: Int, fn:(Int) -> Int): String {
    return "$name of $n is ${fn(n)}"
}