package chapter6.examples.example12

import chapter6.examples.example13.State

fun <S, A, B> map(
    stateA: State<S, A>,
    fn: (A) -> B
): State<S, B> =
    { state: S ->
        val (a, newState) = stateA(state)
        fn(a) to newState
    }

