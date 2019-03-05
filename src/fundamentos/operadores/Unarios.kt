package fundamentos.operadores

fun main() {
    var num1: Int = 1
    var num2: Int = 2

    num1++ //pré fixado
    println(num1)
    --num1 //pós fixado
    println(num1)

    // incremento e decremento
    println(++num1 == num2--) // num1 é incrementado antes da comparação e num2 é decrementado
    println(num1 == num2)
}