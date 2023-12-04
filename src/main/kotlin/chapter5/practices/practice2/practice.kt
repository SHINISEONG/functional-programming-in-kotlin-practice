package chapter5.practices.practice2

import chapter5.examples.example2.Cons
import chapter5.examples.example2.Empty
import chapter5.examples.example2.Stream
import chapter5.examples.example2.Stream.Companion.cons
import chapter5.examples.example2.Stream.Companion.empty

fun <A> Stream<A>.take(n: Int): Stream<A> =
    when (this) {
        is Empty -> empty()
        is Cons ->
            if (n <= 0) empty()
            else cons(head) { tail().take(n - 1) }
    }

fun <A> Stream<A>.drop(n: Int): Stream<A> {
    tailrec fun go(stream: Stream<A>, n: Int): Stream<A> = when (stream) {
        is Empty -> empty()
        is Cons ->
            if (n <= 0) stream
            else go(stream.tail(), n - 1)
    }
    return go(this, n)
}