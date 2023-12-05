package chapter5.practices.practice15

import chapter4.examples.example3.None
import chapter4.examples.example3.Some
import chapter5.examples.example2.Cons
import chapter5.examples.example2.Empty
import chapter5.examples.example2.Stream
import chapter5.practices.practice11.unfold
import chapter5.practices.practice7.append

fun <A> Stream<A>.tails(): Stream<Stream<A>> =
    unfold(this) { stream ->
        when (stream) {
            is Empty -> None
            is Cons -> Some(stream to stream.tail())
        }
    }.append { Stream.empty() }