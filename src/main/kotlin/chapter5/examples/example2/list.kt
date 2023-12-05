package chapter5.examples.example2

sealed class Stream<out A> {
    companion object {
        fun <A> cons(head: () -> A, tail: () -> Stream<A>): Stream<A> {
            val hd: A by lazy { head() }
            val tl: Stream<A> by lazy { tail() }

            return Cons({ hd }, { tl })
        }

        fun <A> empty(): Stream<A> = Empty

        fun <A> of(vararg xs: A): Stream<A> =
            if (xs.isEmpty()) empty()
            else cons(
                { xs.first() },
                { of(*xs.sliceArray(1..<xs.size)) }
            )
    }

    fun exists(p: (A) -> Boolean): Boolean =
        when (this) {
            is Cons -> p(this.head()) || this.tail().exists(p)
            is Empty -> false
        }

    fun existsFromFoldRight(p: (A) -> Boolean): Boolean =
        foldRight({ false }) { a, b -> p(a) || b() }

    fun <B> foldRight(
        initial: () -> B,
        fn: (A, () -> B) -> B
    ): B =
        when (this) {
            is Cons -> fn(this.head()) {
                tail().foldRight(initial, fn)
            }

            is Empty -> initial()
        }

    fun <B> foldLeft(
        initial: () -> B,
        fn: (() -> B, A) -> B
    ): B {
        tailrec fun go(
            stream: Stream<A>,
            initial: () -> B,
            fn: (() -> B, A) -> B
        ): B =
            when (stream) {
                is Cons -> go(
                    stream.tail(),
                    { fn(initial, stream.head()) },
                    fn
                )

                is Empty -> initial()
            }

        return go(this, initial, fn)
    }
}

data class Cons<out A>(val head: () -> A, val tail: () -> Stream<A>) : Stream<A>()

data object Empty : Stream<Nothing>()