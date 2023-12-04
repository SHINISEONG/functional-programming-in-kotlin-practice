package chapter3

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.practices.practice9.foldLeft


fun <A, B> List<A>.map(f: (A) -> B): List<B> =
    this.foldRight(
        List.empty()
    ) { a, b -> Cons(f(a), b) }

fun <A, B> List<A>.foldRight(initial: B, operation: (A, B) -> B): B =
    foldLeft(
        this,
        { b: B -> b },
        { g, a ->
            { b ->
                g(operation(a, b))
            }
        })(initial)

fun List<Double>.sum(): Double =
    this.foldRight(0.0) { a, b -> a + b }

fun <A> List<A>.size(): Int =
    this.foldRight(0) { _, acc -> 1 + acc }

fun List<Double>.isEmpty(): Boolean = when (this) {
    is Nil -> true
    is Cons -> false
}




