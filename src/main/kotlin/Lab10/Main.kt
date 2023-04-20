package Lab10

import java.time.LocalDate

fun main() {
    val user = LibraryUser(
        fullName = "Пліско Олег Олегович",
        yearOfBirth = 2000,
        sex = "чоловіча",
        readersTicketNumber = "4853",
        dateOfIssue = LocalDate.now(),
        listOfBooks = mutableListOf("Кобзар", "Життя і пригоди Робінзона Крузо"),
        userStatus = "активний",
        monthlyReadersContrib = 50.0
    )

    user.addInfAboutTheBook("Тигролови")
    user.addInfAboutTheBook("Записки з підпілля")
    user.addInfAboutTheBook("Плач Єремії")
    val userAnnFee = user.calcOfAnnReadersFee()

    println(user)
    println("Щорічний читацький внесок (з урахуванням знижки): $userAnnFee грн")
}