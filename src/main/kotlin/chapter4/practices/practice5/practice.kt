package chapter4.practices.practice5

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter4.examples.example3.Option
import chapter4.examples.example3.Some
import chapter4.practices.practice3.map2

fun <A, B> traverse(
    list: List<A>,
    fn: (A) -> Option<B>
): Option<List<B>> =
    when (list) {
        is Nil -> Some(Nil)
        is Cons -> map2(fn(list.head), traverse(list.tail, fn)) { b: B, lb: List<B> ->
            Cons(b, lb)
        }
    }

fun <A> sequenceFromTraverse(list: List<Option<A>>): Option<List<A>> =
    traverse(list) { it }
