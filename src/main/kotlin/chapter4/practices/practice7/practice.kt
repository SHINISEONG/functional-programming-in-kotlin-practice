package chapter4.practices.practice7

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter4.examples.example5.Either
import chapter4.examples.example5.Right
import chapter4.practices.practice6.map2

fun <E, A, B> traverse(
    list: List<A>,
    fn: (A) -> Either<E, B>,
): Either<E, List<B>> = when (list) {
    is Nil -> Right(Nil)
    is Cons -> map2(fn(list.head), traverse(list.tail, fn)) { b: B, lb: List<B> ->
        Cons(b, lb)
    }
}

fun <E, A> sequenceFromTraverse(list: List<Either<E, A>>): Either<E, List<A>> =
    traverse(list) { it }
