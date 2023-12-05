package chapter5.practices.practice14

import chapter4.practices.pracitce1.isEmpty
import chapter5.examples.example2.Stream
import chapter5.practices.practice13.zipAll
import chapter5.practices.practice3.takeWhile
import chapter5.practices.practice4.forAll

fun <A> Stream<A>.startWith(that: Stream<A>): Boolean =
    this.zipAll(that)
        .takeWhile { !it.second.isEmpty() }
        .forAll { it.first == it.second }