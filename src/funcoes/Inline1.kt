package funcoes

/**
 * Função inline, exemplo controle de transação
 *
 * Unit equivalente ao void
 */
inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transacao...")
    try{
        funcao()
    } finally {
        println("Fechando transação")
    }
}


fun main() {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}