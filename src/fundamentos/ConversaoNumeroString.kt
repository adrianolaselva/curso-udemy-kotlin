package fundamentos

fun main() {
    val a = 1

    //Número para string
    println(a.toString())

    //String para número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0) //utiliza elvis operator para setar 0 quando retornar null
    println("1".toInt() + 3)
}