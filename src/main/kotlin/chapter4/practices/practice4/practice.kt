package chapter4.practices.practice4

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.foldRight
import chapter4.examples.example3.Option
import chapter4.examples.example3.Some
import chapter4.practices.practice3.map2

fun <A> sequence(list: List<Option<A>>): Option<List<A>> =
    list.foldRight(Some(Nil)) { oa1: Option<A>, acc: Option<List<A>> ->
        map2(oa1, acc) { a1: A, a2: List<A> ->
            Cons(a1, a2)
        }
    }