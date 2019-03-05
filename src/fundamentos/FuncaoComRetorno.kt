package fundamentos


fun main() {
    println(soma(4, 5))
    println(soma(4))
}

fun soma(a: Int, b: Int = 1): Int{
    return a + b
}