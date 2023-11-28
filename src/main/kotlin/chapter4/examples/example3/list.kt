package chapter4.examples.example3

import chapter4.practices.pracitce1.map

sealed class Option<out A> {
    companion object {
        fun <A> empty(): Option<A> = None
    }


}
data class Some<out A>(val get: A) : Option<A>()
data object None : Option<Nothing>()