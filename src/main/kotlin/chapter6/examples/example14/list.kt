package chapter6.examples.example14

data class State<S, out A>(val run: State<S, A>)