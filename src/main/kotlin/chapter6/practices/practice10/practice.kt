package chapter6.practices.practice10

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list11.foldRight

data class State<S, out A>(val run: (S) -> Pair<A, S>) {
    companion object {
        fun <S, A> unit(a: A): State<S, A> = State { state: S -> a to state }

        fun <S, A, B, C> map2(
            stateA: State<S, A>,
            stateB: State<S, B>,
            fn: (A, B) -> C
        ): State<S, C> =
            stateA.flatMap { a ->
                stateB.map { b ->
                    fn(a, b)
                }
            }

        fun <S, A> sequence(states: List<State<S, A>>): State<S, List<A>> =
            foldRight(states, unit(List.empty())) { state, acc ->
                map2(state, acc) { h, t -> Cons(h, t) }
            }
    }

    fun <B> map(fn: (A) -> B): State<S, B> =
        flatMap { a -> unit(fn(a)) }

    fun <B> flatMap(fn: (A) -> State<S, B>): State<S, B> =
        State { state: S ->
            val (a, newState) = this.run(state)
            fn(a).run(newState)
        }

}