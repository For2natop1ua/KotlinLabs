package lab5

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введіть кількість чисел у масиві: ")
    val k = scanner.nextInt()
    val array = IntArray(k)
    val random = Random()
    for (i in array.indices) {
        array[i] = random.nextInt(100)
    }
    println("Ваш масив: ${array.contentToString()}")
    print("На скільки позицій зрушити масив ліворуч: ")
    val n = scanner.nextInt()
    shiftLeft(array, n)
    println("Зрушений масив: ${array.contentToString()}")
}

fun shiftLeft(array: IntArray, n: Int) {
    val length = array.size
    val shift = n % length
    val result = IntArray(length)
    for (i in array.indices) {
        result[(i - shift + length) % length] = array[i]
    }
    for (i in array.indices) {
        array[i] = result[i]
    }
}