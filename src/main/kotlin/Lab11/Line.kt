package Lab11

class Line(x: Float, y: Float, rotation: Float, scale: Float, val length: Float) : Shape(x, y, rotation, scale) {

    override fun draw() {
        // код для відображення прямої на екрані
    }

    override fun erase() {
        // код для видалення зображення прямої з екрану
    }
}