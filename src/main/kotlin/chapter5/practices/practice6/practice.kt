package chapter5.practices.practice6

import chapter4.examples.example3.Option
import chapter4.examples.example3.Some
import chapter5.examples.example2.Stream

fun <A> Stream<A>.headOptionFromFoldRight(): Option<A> =
    foldRight({ Option.empty() }) { h, _ ->
        Some(h)
    }