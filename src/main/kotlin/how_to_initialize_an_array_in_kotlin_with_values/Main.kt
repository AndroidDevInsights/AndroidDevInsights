package how_to_initialize_an_array_in_kotlin_with_values

import kotlin.random.Random

fun main(args: Array<String>) {
    val numbers = arrayOf(1, 1111, 222)
    val strings = arrayOf("1", "fff", "aaa")
    val cars = arrayOf(Car(price = 100), Car(price = 200))
    val numbers1 = doubleArrayOf(1.0, 1111.08, 222.2)

    val numbers2 = Array(5) { i ->
        when(Random.nextBoolean()) {
            true -> i
            false -> "Str $i"
        }
    }

    val number3 = listOf(3, 4, 5).toTypedArray()

    number3.forEach {
        println(it)
    }
}

data class Car(val price: Int)