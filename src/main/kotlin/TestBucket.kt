import strikt.api.Assertion
import strikt.api.DescribeableBuilder
import strikt.api.expectThat

data class Bucket<T>(val data: T, val property: String)
//data class Bucket<out T>(val data: T, val property: String)
//data class Bucket<T: Any>(val data: T, val property: String)
data class Entity(val someVal: String = "")

fun main(args: Array<String>) {

    val tBucket = Bucket(Entity(), "my property")

    expectThat(tBucket).builderOutAny("whatever") //bad
    expectThat(tBucket).builderStar("whatever") //bad
    expectThat(tBucket).builderT("whatever") //good
    expectThat(tBucket).describeOutAny("whatever") //bad
    expectThat(tBucket).describeStar("whatever") //bad
    expectThat(tBucket).describeT("whatever") //good
    expectThat(tBucket).inlineDescribeOutAny("whatever") //bad
    expectThat(tBucket).inlineDescribeStar("whatever") //bad
    expectThat(tBucket).inlineDescribeT("whatever") //good
    expectThat(tBucket).inlineBuilderOutAny("whatever") //bad
    expectThat(tBucket).inlineBuilderStar("whatever") //bad
    expectThat(tBucket).inlineBuilderT("whatever") //good
}



fun Assertion.Builder<Bucket<out Any>>.builderOutAny(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun Assertion.Builder<Bucket<*>>.builderStar(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun <T> Assertion.Builder<Bucket<T>>.builderT(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}


fun DescribeableBuilder<Bucket<out Any>>.describeOutAny(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun DescribeableBuilder<Bucket<*>>.describeStar(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

fun <T> DescribeableBuilder<Bucket<T>>.describeT(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun DescribeableBuilder<Bucket<out Any>>.inlineDescribeOutAny(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun DescribeableBuilder<Bucket<*>>.inlineDescribeStar(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun <T> DescribeableBuilder<Bucket<T>>.inlineDescribeT(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun Assertion.Builder<Bucket<out Any>>.inlineBuilderOutAny(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun Assertion.Builder<Bucket<*>>.inlineBuilderStar(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}

inline fun <T> Assertion.Builder<Bucket<T>>.inlineBuilderT(p: String) {
    assert("has property", p) {
        when (val prop = it.property) {
            p -> pass()
            else -> fail(actual = prop)
        }
    }
}
