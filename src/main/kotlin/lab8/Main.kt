package lab8

import java.io.File

data class Book(val author: String, val title: String, val year: Int, val pages: Int)

fun main() {
    // Створення порожнього списку книг
    val books = mutableListOf<Book>()
    // Читання файлу по рядках
    File("src/main/kotlin/lab8/books.txt").forEachLine { line ->
        // Розділення рядка на поля та створення об'єкта книги
        val fields = line.split(", ")
        val book = Book(fields[0], fields[1], fields[2].toInt(), fields[3].toInt())
        // Додавання книги до списку
        books.add(book)
    }

    print("Введіть рік: ")
    val year = readLine()?.toIntOrNull() ?: return
    // Фільтрація списку книг за роком видання
    val filteredBooks = books.filter { it.year >= year }

    // Виведення списку книг, відсортованого за роком видання
    if (filteredBooks.isNotEmpty()) {
        filteredBooks.forEach {
            println("${it.author} - ${it.title} (${it.year}), ${it.pages} стор.")
        }
    } else {
        println("Книги, видані після $year року, відсутні.")
    }
}