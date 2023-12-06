package chapter6.examples.example8

import chapter6.examples.example7.Rand

fun <A> unit(a: A): Rand<A> = { randomGenerator -> a to randomGenerator }