package chapter3.practices.practice12

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.examples.list11.foldRight
import chapter3.practices.practice9.foldLeft

fun <A, B>foldRightFromFoldLeft(xs: List<A>, z: B, fn: (A, B) -> B): B =
    foldLeft(xs,
        {b: B -> b},
        { g, a ->
            { b ->
                g(fn(a, b))
            }
        }
    )(z)


fun <A, B>foldLeftFromFoldRight(xs: List<A>, z: B, fn: (B, A) -> B): B =
    foldRight(xs,
        { b: B -> b },
        {a, g ->
            {b ->
                g(fn(b, a))
            }
        }
    )(z)


typealias Identity<B> = (B) -> B

fun <A, B>foldLeftFromFoldRightDemystified(
    xs: List<A>,
    z: B,
    fn: (B, A) -> B
): B {
    val identity: Identity<B> = {b: B -> b}
    val combinerDelayer: (A, Identity<B>) -> Identity<B> =
        {a: A, delayedExec: Identity<B> ->
            {b: B ->
                delayedExec(fn(b, a))
            }
        }

    val chain: Identity<B> = foldRight(xs, identity, combinerDelayer)

    return chain(z)
}

fun <A, B>foldRightFromFoldLeftDemystified(
    xs: List<A>,
    z: B,
    fn: (A, B) -> B
): B {

    val identity: Identity<B> ={b: B -> b}

    val combinerDelayer: (Identity<B>, A) -> Identity<B> =
        { delayedExec: Identity<B>, a:A ->
            {b: B ->
                delayedExec(fn(a, b))
            }
        }

    val chain: Identity<B> = foldLeft(xs, identity, combinerDelayer)

    return chain(z)
}

fun main() {
    val a = foldRightFromFoldLeft(List.of("1", "2", "3"), Nil as List<String>){x, y -> Cons(x, y) }
    println(a)
}