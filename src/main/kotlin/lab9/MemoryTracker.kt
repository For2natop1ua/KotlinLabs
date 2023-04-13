package lab9

class MemoryTracker private constructor() {

    // companion object - це об'єкт, який створюється разом з класом `MemoryTracker`
    companion object {
        // оголошуємо приватну змінну, яка буде містити єдиний екземпляр класу `MemoryTracker`
        private var instance: MemoryTracker? = null
        // використовуємо анотацію `@JvmStatic`, щоб зробити метод статичним і зробити його доступним з Java
        @JvmStatic
        // функція, що повертає єдиний екземпляр класу `MemoryTracker`
        fun getInstance(): MemoryTracker {
            // якщо єдиний екземпляр ще не створено, створюємо його
            if (instance == null) {
                instance = MemoryTracker()
            }
            // повертаємо єдиний екземпляр
            return instance as MemoryTracker
        }
    }
    // множина для зберігання об'єктів, що відслідковуються
    private val objects = mutableSetOf<Any>()
    // додаємо об'єкт до множини і викликаємо метод `printStatus()`, щоб вивести статус
    fun addObject(obj: Any) {
        objects.add(obj)
        printStatus()
    }
    // видаляємо об'єкт з множини і викликаємо метод `printStatus()`, щоб вивести статус
    fun removeObject(obj: Any) {
        objects.remove(obj)
        printStatus()
    }
    // приватний метод, що виводить статус - кількість об'єктів та використану оперативну пам'ять
    private fun printStatus() {
        // розраховуємо використану оперативну пам'ять в мегабайтах
        val usedMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024
        println("Кількість об'єктів: ${objects.size}. Використано пам'яті: $usedMemory MB")
    }
}