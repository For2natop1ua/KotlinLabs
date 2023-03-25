package Module1

/*Напишіть програму, яка трансформує (тобто усі зміни зберігаються в цьому ж файлі) заданий файл таким чином:
усі цифри замінюються буквами таким чином: 1 - a, 2 - b, 3 - c, ., 9 - i, 0 - j.
Інші символи міняються на '_'.
Наприклад: ABC рядок 123 -> ___________abc */

import java.io.File

fun main() {
    // назва вхідного файлу
    val filePath = "D:\\ХАІ\\4 курс\\Мобільні технології\\KotlinLabs\\src\\main\\kotlin\\Module1\\input.txt"
    val output = StringBuilder() // буфер для запису трансформованого тексту

    File(filePath).forEachLine { line ->
        line.forEach { char ->
            when (char) {
                in '0'..'9' -> output.append(('a' + char.code - '1'.code))
                else -> output.append('_')
            }
        }
        output.appendLine() // додати кінець рядка
    }

    File(filePath).writeText(output.toString()) // перезаписати вміст файлу з трансформованим текстом
}