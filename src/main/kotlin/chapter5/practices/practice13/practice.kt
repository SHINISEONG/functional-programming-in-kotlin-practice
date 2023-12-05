package chapter5.practices.practice13

import chapter4.examples.example3.None
import chapter4.examples.example3.Option
import chapter4.examples.example3.Some
import chapter5.examples.example2.Cons
import chapter5.examples.example2.Empty
import chapter5.examples.example2.Stream
import chapter5.examples.example2.Stream.Companion.empty
import chapter5.practices.practice11.unfold

fun <A, B> Stream<A>.mapFromUnfold(fn: (A) -> B): Stream<B> =
    unfold(this) { stream: Stream<A> ->
        when (stream) {
            is Cons -> Some(fn(stream.head()) to stream.tail())
            is Empty -> None
        }
    }

fun <A> Stream<A>.takeFromUnfold(n: Int): Stream<A> =
    unfold(this) { stream: Stream<A> ->
        when (stream) {
            is Cons ->
                if (n > 0)
                    Some(stream.head() to stream.tail().takeFromUnfold(n - 1))
                else
                    None

            is Empty -> None
        }
    }

fun <A> Stream<A>.takeWhileFromUnfold(p: (A) -> Boolean): Stream<A> =
    unfold(this) { stream: Stream<A> ->
        when (stream) {
            is Cons ->
                if (p(stream.head()))
                    Some(stream.head() to stream.tail())
                else
                    None

            is Empty -> None
        }
    }

fun <A, B, C> Stream<A>.zipWith(
    that: Stream<B>,
    fn: (A, B) -> C
): Stream<C> = unfold(this to that) { (streamA: Stream<A>, streamB: Stream<B>) ->
    when (streamA) {
        is Cons ->
            when (streamB) {
                is Cons ->
                    Some(
                        fn(streamA.head(), streamB.head()) to
                                (streamA.tail() to streamB.tail())
                    )

                is Empty -> None
            }

        is Empty -> None
    }
}

fun <A, B> Stream<A>.zipAll(
    that: Stream<B>
): Stream<Pair<Option<A>, Option<B>>> =
    unfold(this to that) { (ths: Stream<A>, tht: Stream<B>) ->
        when (ths) {
            is Cons ->
                when (tht) {
                    is Cons ->
                        Some(
                            Pair(
                                Some(ths.head()) to Some(tht.head()),
                                ths.tail() to tht.tail()
                            )
                        )

                    is Empty ->
                        Some(
                            Pair(
                                Some(ths.head()) to None,
                                ths.tail() to empty()
                            )
                        )
                }

            is Empty ->
                when (tht) {
                    is Cons ->
                        Some(
                            Pair(
                                None to Some(tht.head()),
                                empty<A>() to tht.tail()
                            )
                        )

                    is Empty ->
                        None
                }
        }
    }
