import strikt.api.Assertion
import strikt.api.DescribeableBuilder
import strikt.api.expectThat

data class Bucket<T>(val data: T, val property: String)
//data class Bucket<out T>(val data: T, val property: String)
//data class Bucket<T: Any>(val data: T, val property: String)
data class Entity(val someVal: String = "")

fun main(args: Array<String>) {

    val tBucket = Bucket(Entity(), "my property")

    expectThat(tBucket).first("whatever") //bad
    expectThat(tBucket).second("whatever") //bad
    expectThat(tBucket).third("whatever") //good
    expectThat(tBucket).fourth("whatever") //bad
    expectThat(tBucket).fifth("whatever") //bad
    expectThat(tBucket).sixth("whatever") //good
    expectThat(tBucket).seventh("whatever") //bad
    expectThat(tBucket).eighth("whatever") //bad
    expectThat(tBucket).ninth("whatever") //good
    expectThat(tBucket).tenth("whatever") //bad
    expectThat(tBucket).eleventh("whatever") //bad
    expectThat(tBucket).twelfth("whatever") //good
}



fun Assertion.Builder<Bucket<out Any>>.first(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun Assertion.Builder<Bucket<*>>.second(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun <T> Assertion.Builder<Bucket<T>>.third(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}


fun DescribeableBuilder<Bucket<out Any>>.fourth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun DescribeableBuilder<Bucket<*>>.fifth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun <T> DescribeableBuilder<Bucket<T>>.sixth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun DescribeableBuilder<Bucket<out Any>>.seventh(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun DescribeableBuilder<Bucket<*>>.eighth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun <T> DescribeableBuilder<Bucket<T>>.ninth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun Assertion.Builder<Bucket<out Any>>.tenth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun Assertion.Builder<Bucket<*>>.eleventh(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun <T> Assertion.Builder<Bucket<T>>.twelfth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}
