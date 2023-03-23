package lab4

/*Вивести на екран таблицю значень функції Y(x) та її розклад в ряд S(x) для х,
що змінюється від а до b з кроком h=(a-b)/10.*/

import kotlin.math.exp
import kotlin.math.pow

fun main() {
    val n = 80
    val a = 0.1
    val b = 1.0
    val h = (b - a) / 10.0
    println("x     Y(x)      S(x)")
    var x = a
    while (x <= b) {
        var S = 0.0
        var fact = 1.0
        for (i in 0..n) {
            val term = (x.pow(2 * i + 1)) / fact
            S += term
            fact *= (2 * i + 2) * (2 * i + 3)
        }
        val Y = (exp(x) - exp(-x)) / 2

        println("%.2f".format(x) + "  %.6f".format(Y) + "  %.6f".format(S))
        x += h
    }
}