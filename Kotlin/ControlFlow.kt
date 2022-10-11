fun main() {
    // Enum
    val asus = Laptops.ASUS // ASUS
    val asusVal = LaptopsVal.ASUS.value // Asus
    
    // Range
    val alphabets = 'A'..'Z' // A => Z
    val alphatesNew = 'A'.rangeTo('Z') // same too
    
}

enum class Laptops {
    LENOVO, ASUS, ACER, HP
}

enum class LaptopsVal(val value: String) {
    LENOVO("Lenovo"),
    ASUS("Asus"),
    ACER("Acer"),
    HP("Hp")
}