package fundamentos.operadores

fun main() {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = false

    var comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    var comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    var comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2 // quando ambos forem true o resultado será false

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    if(!comprouSorvete){
        println("A saúde agradece")
    }
}