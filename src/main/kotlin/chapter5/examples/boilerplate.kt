package chapter5.examples

import chapter4.examples.example3.None
import chapter4.examples.example3.Option
import chapter4.examples.example3.Some
import chapter5.examples.example2.Cons
import chapter5.examples.example2.Empty
import chapter5.examples.example2.Stream

fun <A> Stream<A>.headOption(): Option<A> =
    when (this) {
        is Empty -> None
        is Cons -> Some(head())
    }