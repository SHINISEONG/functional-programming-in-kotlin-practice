package chapter4.practices.practice3

import chapter4.examples.example3.Option
import chapter4.practices.pracitce1.flatMap
import chapter4.practices.pracitce1.map

fun <A, B, C> map2(optionA: Option<A>, optionB: Option<B>, fn: (A, B) -> C): Option<C> =
    optionA.flatMap { a ->
        optionB.map { b ->
            fn(a, b)
        }
    }