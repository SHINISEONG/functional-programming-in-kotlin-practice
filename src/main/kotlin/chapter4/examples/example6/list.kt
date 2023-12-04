package chapter4.examples.example6

import chapter4.examples.example5.Either
import chapter4.examples.example5.Left
import chapter4.examples.example5.Right

fun <A> catches(a: () -> A): Either<Exception, A> =
    try {
        Right(a())
    } catch (e: Exception) {
        Left(e)
    }