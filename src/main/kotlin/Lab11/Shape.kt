package Lab11

abstract class Shape(var x: Float, var y: Float, var rotation: Float, var scale: Float) {

    // Показати фігуру на екрані
    abstract fun draw()

    // Зробити фігуру невидною (знищити її зображення)
    abstract fun erase()

    // Повернути фігуру на заданий кут (кут надається у градусах)
    fun rotate(angle: Float) {
        rotation += angle
    }

    // Пересунути фігуру на наданий вектор
    fun translate(dx: Float, dy: Float) {
        x += dx
        y += dy
    }
    // Визначити площу фігури (за замовчуванням повернення нуля)
    open fun area(): Float {
        return 0f
    }
}