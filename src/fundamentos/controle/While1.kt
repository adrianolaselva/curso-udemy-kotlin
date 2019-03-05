package fundamentos.controle

fun main() {
    var opcao: Int = 0

    while(opcao != -1){
        var line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você excolheu a opção $opcao")
    }

    println("Até a próxima!")
}