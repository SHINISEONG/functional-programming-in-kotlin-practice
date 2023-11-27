package chapter3.practices.practice19

import chapter3.examples.list1.Cons
import chapter3.practices.practice12.foldRightFromFoldLeft
import chapter3.examples.list1.List
import chapter3.examples.list11.foldRight

fun <A, B> flatMap(aList: List<A>, fn: (A) -> List<B>): List<B> =
    foldRightFromFoldLeft(
        foldRightFromFoldLeft(
            aList,
            List.empty()
        ) { a, b:List<List<B>> ->
            Cons(fn(a), b)
        },
        List.empty()
    ) { a, b ->
        foldRight(a, b){ a2, b2 ->
            Cons( a2, b2 )
        }
    }

fun <A, B> flatMapAnswer(aList: List<A>, fn: (A) -> List<B>): List<B> =
    foldRightFromFoldLeft(
        aList,
        List.empty()
    ) { a, bList ->
        foldRightFromFoldLeft(
            fn(a),
            bList
        ) { b, bs ->
            Cons(b, bs)
        }
    }