import strikt.api.Assertion
import strikt.api.DescribeableBuilder
import strikt.api.expectThat

data class BucketT<T>(val data: T, val property: String)
//data class BucketT<out T>(val data: T, val property: String)
//data class BucketT<T: Any>(val data: T, val property: String)
data class Entity(val someVal: String = "")

fun main(args: Array<String>) {

    val tBucket = BucketT(Entity(), "my property")

    expectThat(tBucket).first("whatever")
    expectThat(tBucket).second("whatever")
    expectThat(tBucket).third("whatever")
    expectThat(tBucket).fourth("whatever")
    expectThat(tBucket).fifth("whatever")
    expectThat(tBucket).sixth("whatever")
    expectThat(tBucket).seventh("whatever")
    expectThat(tBucket).eighth("whatever")
    expectThat(tBucket).ninth("whatever")
    expectThat(tBucket).tenth("whatever")
    expectThat(tBucket).eleventh("whatever")
    expectThat(tBucket).twelfth("whatever")
}

fun Assertion.Builder<BucketT<out Any>>.first(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun Assertion.Builder<BucketT<*>>.second(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun <T> Assertion.Builder<BucketT<T>>.third(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}


fun DescribeableBuilder<BucketT<out Any>>.fourth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun DescribeableBuilder<BucketT<*>>.fifth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun <T> DescribeableBuilder<BucketT<T>>.sixth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun DescribeableBuilder<BucketT<out Any>>.seventh(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun DescribeableBuilder<BucketT<*>>.eighth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun <T> DescribeableBuilder<BucketT<T>>.ninth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun Assertion.Builder<BucketT<out Any>>.tenth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun Assertion.Builder<BucketT<*>>.eleventh(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun <T> Assertion.Builder<BucketT<T>>.twelfth(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}