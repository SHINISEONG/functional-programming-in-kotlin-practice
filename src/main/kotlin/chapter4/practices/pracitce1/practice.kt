package chapter4.practices.pracitce1

import chapter4.examples.example3.None
import chapter4.examples.example3.Option
import chapter4.examples.example3.Some

fun <A, B> Option<A>.map(fn: (A) -> (B)): Option<B> =
    when (this) {
        is None -> None
        is Some -> Some(fn(get))
    }

fun <A> Option<A>.getOrElse(default: () -> A): A =
    when (this) {
        is None -> default()
        is Some -> get
    }
fun <A, B> Option<A>.flatMap(fn: (A) -> Option<B>): Option<B> =
    this.map(fn).getOrElse { None }

fun <A> Option<A>.orElse(ob: () -> Option<A>): Option<A> =
    this.map{ Some(it) }.getOrElse { ob() }

fun <A> Option<A>.filter(fn: (A) -> Boolean): Option<A> =
    this.flatMap { if (fn(it)) Some(it) else None }

fun <A> Option<A>.isEmpty(): Boolean =
    this.map { false }
        .getOrElse { true }