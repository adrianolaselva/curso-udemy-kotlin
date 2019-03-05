package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    //exemplo para mostrar que tudo que esta no pacote Kotlin.io ficam disponíveis
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("BOLA")
    println(coisa.nome)

    //Impressão de elemento da enum
    println(CARA)

    println("${soma(2, 3)} ${subtracao(4, 6)}")
}