package chapter4.practices.practice6

import chapter4.examples.example5.Either
import chapter4.examples.example5.Left
import chapter4.examples.example5.Right

fun <E, A, B> Either<E, A>.map(fn: (A) -> (B)): Either<E, B> =
    when (this) {
        is Left -> Left(value)
        is Right -> Right(fn(value))
    }

fun <E, A> Either<E, A>.orElse(default: () -> Either<E, A>): Either<E, A> =
    when (this) {
        is Left -> default()
        is Right -> this
    }


fun <E, A, B> Either<E, A>.flatMap(fn: (A) -> Either<E, B>): Either<E, B> =
    when (this) {
        is Left -> Left(value)
        is Right -> fn(value)
    }

fun <E, A, B, C> map2(
    eitherA: Either<E, A>,
    eitherB: Either<E, B>,
    fn: (A, B) -> C
): Either<E, C> =
    eitherA.flatMap { a ->
        eitherB.map { b ->
            fn(a, b)
        }
    }

