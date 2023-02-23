package lab3

fun main(){
    print("Вкажіть ваш вік: ")
    val age:Int = readln().toInt()
    if (age >= 18) println("Користувач повнолітній")
    else println("Користувач неповнолітній")
}