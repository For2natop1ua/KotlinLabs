package lab6

/*Задано символьну матрицю розміром N x M.
Визначити кількість різних особистих елементів матриці.
(Тобто повторювані елементи рахувати один раз).*/

fun main(){
    val matrix = arrayOf(
        arrayOf('a', 'b', 'c'),
        arrayOf('d', 'e', 'f'),
        arrayOf('a', 'b', 'g')
    )
    val distinctCount = countDistinctElements(matrix)
    println("Задана матриця:")
    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println() // додаємо порожній рядок в кінці кожного рядка матриці
    }
    println("Кількість різних особистих елементів матриці: $distinctCount")
}

fun countDistinctElements(matrix: Array<Array<Char>>): Int {
    val uniqueChars = mutableSetOf<Char>() // множина унікальних символів
    for (row in matrix) {
        for (element in row) {
            uniqueChars.add(element) // додаємо кожний символ до множини
        }
    }
    return uniqueChars.size // повертаємо кількість унікальних символів
}