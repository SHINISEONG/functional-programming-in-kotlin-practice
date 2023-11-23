package chapter3.examples.list1

sealed class List<out A> {
    companion object {
        fun <A> of(vararg aa: A): List<A> {
            val tail = aa.sliceArray(1..<aa.size)
            return if(aa.isEmpty()) Nil else Cons(aa[0],of(*tail))
        }

        fun sum(ints: List<Int>): Int =
            when (ints) {
                is Nil -> 0
                is Cons -> ints.head + sum(ints.tail)
            }

        fun product(ints: List<Int>): Int =
            when (ints) {
                is Nil -> 1
                is Cons -> if (ints.head.isZero()) 0 else ints.head * product(ints.tail)
            }
        fun joinToString(strings: List<String>, separator: String = ", "): String =
            when (strings) {
                is Nil -> ""
                is Cons ->
                    strings.head +
                            if (strings.tail !is Nil) separator + joinToString(strings.tail, separator)
                            else "" + joinToString(strings.tail, separator)
            }
    }
}
data object Nil : List<Nothing>()
data class Cons<out A>(val head: A, val tail: List<A>) : List<A>()

val list1: List<Double> = Nil
val list2: List<Int> = Cons(1, Nil)
val list3: List<String> = Cons("a", Cons("b", Cons("c",Nil)))
val list4: List<Int> = List.of(1, 2, 3, 4, 5)
fun main() {
    println(list4)
    println(List.sum(list4))
    println(List.product(list4))
    println(List.joinToString(List.of("a", "b", "c", "d", "e"),"___"))
}

fun Int.isZero() = this == 0
fun Int.isNotZero() = this != 0