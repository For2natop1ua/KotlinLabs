package Lab10

import java.time.LocalDate

open class Person(val fullName: String, val yearOfBirth: Int, val sex: String)

class LibraryUser(
    fullName: String,
    yearOfBirth: Int,
    sex: String,
    val readersTicketNumber: String,
    val dateOfIssue: LocalDate,
    val listOfBooks: MutableList<String>,
    val monthlyReadersContrib: Double,
    var userStatus: String
) : Person(fullName, yearOfBirth, sex) {

    init {
        // ініціалізація інформації
    }

    private fun discountCalculation(): Double {
        val numberOfBooks = listOfBooks.size
        return when {
            numberOfBooks < 5 -> 0.0
            numberOfBooks < 10 -> monthlyReadersContrib * 0.1
            else -> monthlyReadersContrib * 0.2
        }
    }

    fun calcOfAnnReadersFee(): Double {
        return monthlyReadersContrib * 12 - discountCalculation()
    }

    fun addInfAboutTheBook(name: String) {
        listOfBooks.add(name)
    }

    override fun toString(): String {
        return """
            ПІБ: $fullName
            Рік народження: $yearOfBirth
            Стать: $sex
            Номер читацького квитка: $readersTicketNumber
            Дата видачі: $dateOfIssue
            Перелік книжок: $listOfBooks
            Щомісячний читацький внесок: $monthlyReadersContrib
            Статус користувача: $userStatus
            """.trimIndent()
    }
}