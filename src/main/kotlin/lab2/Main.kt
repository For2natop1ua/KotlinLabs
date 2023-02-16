package lab2

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.system.exitProcess

val reader = Scanner(System.`in`)

fun main() {

    print("\nНадані програми:\n" +
            "1. Програма, яка запрошує ім'я, прізвище і вік і після цього виводитиме 3 рядки.\n" +
            "2. Програма, яка запрошує радіус кола і виводити його радіус і площу.\n" +
            "3. Програма, яка запрошує 3 сторони довільного трикутника, обчислює площу та виводить на екран.\n" +
            "4. Програма, яка запрошує десяткове число і виводить його у шістнадцядковій формі.\n" +
            "5. Програма, яка запрошує 2 числа і виводитиме на екран залишок від ділення першого на другому.\n" +
            "6. Програма, яка запрошує основу та висоту паралелограма та виводить на екран його площу.\n" +
            "7. Програма, яка запрошує розмір файлу в байтах і виводитиме його розмір у кілобайтах.\n" +
            "8. Програма, яка запрошує жіноче і чоловіче імена та виводити фразу " +
            "\"жіноче ім'я + чоловіче ім'я = Love\".\n" +
            "9. Програма для перевірки порозрядних операцій.\n" +
            "0. Вийти з додатку.\n")
    print("\nВведіть яку програму відкрити: ")
    when (reader.nextInt()){
        1 -> first()
        2 -> second()
        3 -> third()
        4 -> fourth()
        5 -> fifth()
        6 -> sixth()
        7 -> seventh()
        8 -> eighth()
        9 -> ninth()
        0 -> exitProcess(0)
    }
}

fun first(){
    print("Введіть ім'я: ")
    val fname = readLine()
    print("Введіть прізвище: ")
    val lname = readLine()
    print("Введіть свій вік: ")
    val age:Int = reader.nextInt()
    println("\nВаше ім'я: $fname")
    println("Ваше прізвище: $lname")
    println("Рік тому ваш вік був: ${age-1}")
    toMenu()
}

fun second(){
    print("Введіть радіус кола: ")
    val radius:Double = reader.nextDouble()
    val ans = (Math.PI * radius.pow(2.0) * 100.0).roundToInt() /100.00
    println("Площа кола: $ans")
    toMenu()
}

fun third(){
    println("Введіть 3 сторони трикутника:")
    print("a: ")
    val a:Double = reader.nextDouble()
    print("b: ")
    val b:Double = reader.nextDouble()
    print("c: ")
    val c:Double = reader.nextDouble()
    val p:Double = (a+b+c)/2
    val ans = ((sqrt(p*(p-a)*(p-b)*(p-c)))*100.0).roundToInt() /100.00
    println("Площа трикутника: $ans")
    toMenu()
}

fun fourth(){
    print("Десяткове число: ")
    val num:Int = reader.nextInt()
    println("Шістнадцядкове число: " +Integer.toHexString(num))
    toMenu()
}

fun fifth(){
    println("Введіть два числа:")
    print("a: ")
    val a:Double = reader.nextDouble()
    print("b: ")
    val b:Double = reader.nextDouble()
    println("Ви запровадили числа: $a і $b")
    println("Залишок від ділення: ${a % b}")
    toMenu()
}

fun sixth(){
    print("Основа паралелограма: ")
    val a:Double = reader.nextDouble()
    print("Висота паралелограма: ")
    val b:Double = reader.nextDouble()
    val ans = ((a*b)*100.0).roundToInt() /100.00
    println("Площа паралелограма: $ans")
    toMenu()
}

fun seventh(){
    print("Розмір файлу: ")
    val a:Double = reader.nextDouble()
    val ans = ((a/1024)*100.0).roundToInt() /100.00
    println("Розмір файлу в кілобайтах: $ans Кб")
    toMenu()
}

fun eighth(){
    print("Введіть жіноче ім'я: ")
    val female = readLine()
    print("Введіть чоловіче ім'я: ")
    val male = readLine()
    println("$female + $male = Love")
    toMenu()
}

fun ninth(){
    print("Введіть перше число:")
    val number1:Int = reader.nextInt()
    print("Введіть друге число:")
    val number2:Int = reader.nextInt()
    println("Результат побітової операції OR між числами $number1 і $number2: ${number1 or number2}")
    println("Результат побітової операції AND між числами $number1 і $number2: ${number1 and number2}")
    println("Результат побітової операції XOR між числами $number1 і $number2: ${number1 xor number2}")
    println("Результат інверсії числа $number1 : ${number1.inv()}")
    println("Результат зсуву бітів числа зі знаком $number1 на 2 розряди вліво : ${number1.shl(2)}")
    println("Результат зсуву бітів числа зі знаком $number1 на 2 розряди вправо : ${number1.shr(2)}")
    println("Результат зсуву бітів беззнакового числа $number1 на 2 розряди вправо : ${number1.ushr(2)}")
    toMenu()
}

fun toMenu(){
    println("\nПрограма завершена. Перехід до меню.")
    return main()
}