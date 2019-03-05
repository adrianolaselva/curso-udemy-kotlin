package funcoes

/**
 * Acrescenta funções na API padrão
 */
fun <E> List<E>.secondOrNull(): E? = if(this.size>2) this.get(1) else null

fun main() {
    var list = listOf("teste1", "teste2", "teste3")
    println("Segundo elemento da lista: ${list.secondOrNull()}")
}