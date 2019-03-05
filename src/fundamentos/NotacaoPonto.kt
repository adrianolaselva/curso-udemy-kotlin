package fundamentos

fun main() {
    //notação .dec decrementa, ou seja o valor de 33 passa a ser 32
    var a: Int = 33.dec()
    var b: String = a.toString()

    println("Int: $a ")
    println("Primeiro char da sstring b é: ${b.first()} ")
}