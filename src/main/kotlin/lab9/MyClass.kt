package lab9

// Клас, який використовує MemoryTracker для відстеження кількості створених об'єктів та їхньої впливу на пам'ять.
class MyClass {
    // Створення об'єкту MemoryTracker.
    private val memoryTracker = MemoryTracker.getInstance()
    // Додавання поточного об'єкту до MemoryTracker.
    init {
        memoryTracker.addObject(this)
    }
    // Функція, яка виконує певну дію з об'єктом.
    fun doSomething() {
        // робота з об'єктом
    }

    // Функція, яка викликається системою при звільненні пам'яті від об'єкта.
    // Видалення поточного об'єкту з MemoryTracker.
    fun finalize() {
        memoryTracker.removeObject(this)
    }
}