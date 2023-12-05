package chapter5.practices.practice7

import chapter5.examples.example2.Stream

fun <A, B> Stream<A>.map(fn: (A) -> B) =
    foldRight({ Stream.empty() }) { operation, acc ->
        Stream.cons({ fn(operation) }, acc)
    }

fun <A> Stream<A>.filter(p: (A) -> Boolean) =
    foldRight({ Stream.empty() }) { operation, acc ->
        if (p(operation))
            Stream.cons({ operation }, acc)
        else
            acc()
    }

fun <A> Stream<A>.append(sa: () -> Stream<A>): Stream<A> =
    foldRight(sa) { h, t ->
        Stream.cons({ h }, t)
    }

fun <A, B> Stream<A>.flatMap(f: (A) -> Stream<B>): Stream<B> =
    foldRight({ Stream.empty() }) { h, t ->
        f(h).append(t)
    }