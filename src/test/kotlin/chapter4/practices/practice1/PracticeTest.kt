package chapter4.practices.practice1

import chapter4.examples.example3.None
import chapter4.examples.example3.Option
import chapter4.examples.example3.Some
import chapter4.practices.pracitce1.*
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    val none = Option.empty<Int>()
    val some = Some(10)

    "Some에 map 적용" {
        some.map { it * 10 } shouldBe Some(100)
    }
    "None에 map 적용 " {
        none.map { it * 10 } shouldBe None
    }

    "Some에 flatMap 적용을 적용시 get에 고차 함수를 적용한 Option으로 반환한다." {
        some.flatMap { Some(it.toString() + "A") } shouldBe Some("10A")
    }
    "None에 FlatMap 적용 시 그대로 None을 리턴해야한다" {
        none.flatMap { Some(it.toString() + "A") } shouldBe None
    }

    "Option.getOrElse some에 적용" {
        some.getOrElse { 0 } shouldBe 10
        none.getOrElse { 10 } shouldBe 10
    }

    "Option.orElse Some에 적용" {
        some.orElse { Some(20) } shouldBe some
    }

    "Option.orElse None에 적용" {
        none.orElse { Some(20) } shouldBe Some(20)
    }

    "Option.filter Some에 적용 조건 식에 해당하는 경우" {
        some.filter { it > 1 } shouldBe some
    }

    "Option.filter Some에 적용 조건 식에 해당하지 않는 경우" {
        some.filter { it > 20 } shouldBe None
    }

    "Option.filter None에 적용" {
        none.filter { it > 1 } shouldBe None
    }

})