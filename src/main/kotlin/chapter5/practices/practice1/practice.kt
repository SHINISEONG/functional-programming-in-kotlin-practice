package chapter5.practices.practice1

import chapter3.examples.list1.List
import chapter3.practices.practice11.reverse
import chapter5.examples.example2.Cons
import chapter5.examples.example2.Empty
import chapter5.examples.example2.Stream
import chapter3.examples.list1.Cons as ListCons
import chapter3.examples.list1.Nil as ListNil

fun <A> Stream<A>.toListUnsafe(): List<A> =
    when (this) {
        is Empty -> ListNil
        is Cons -> ListCons(head(), tail().toListUnsafe())
    }

fun <A> Stream<A>.toList(): List<A> {
    tailrec fun go(stream: Stream<A>, acc: List<A>): List<A> =
        when (stream) {
            is Empty -> acc
            is Cons -> go(stream.tail(), ListCons(stream.head(), acc))
        }
    return reverse(go(this, ListNil))
}