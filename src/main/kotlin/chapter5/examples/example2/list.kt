package chapter5.examples.example2

sealed class Stream<out A> {
    companion object {
        fun <A> cons(head: () -> A, tail: () -> Stream<A>): Stream<A> {
            val hd: A by lazy { head() }
            val tl: Stream<A> by lazy { tail() }
            
            return Cons({ hd }, { tl })
        }

        fun empty(): Stream<Nothing> = Empty

        fun <A> of(vararg xs: A): Stream<A> =
            if (xs.isEmpty()) empty()
            else cons(
                { xs.first() },
                { of(*xs.sliceArray(1..<xs.size)) }
            )
    }
}

data class Cons<out A>(val head: () -> A, val tail: () -> Stream<A>) : Stream<A>() {

}

data object Empty : Stream<Nothing>()