package chapter3.practices.practice20

import chapter3.examples.list1.List
import chapter3.practices.practice19.flatMapAnswer

fun <A> filterFromFlatMap(list: List<A>, fn: (A) -> Boolean): List<A> =
    flatMapAnswer(list) { if(fn(it)) List.of(it) else List.empty() }
