package chapter5.examples.example2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ListTest : StringSpec({
    "foldRight 테스트" {
        Stream.of(1, 2, 3).foldRight({ 0 }) { a, b -> a + b() } shouldBe 6
    }
    "foldLeft 테스트" {
        Stream.of(1, 2, 3).foldLeft({ 0 }) { b, a -> b() + a } shouldBe 6
    }
})