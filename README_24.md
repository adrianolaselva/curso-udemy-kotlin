
## Explorando imports


#### Exemplo

```kotlin
package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples //Import de função direto de pacote   
import fundamentos.pacoteA.Coisa // import classe coisa
import fundamentos.pacoteA.FaceMoeda.CARA //import referenciando enum expecífico
import fundamentos.pacoteB.*

fun main() {
    //exemplo para mostrar que tudo que esta no pacote Kotlin.io ficam disponíveis
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("BOLA")
    println(coisa.nome)xz

    //Impressão de elemento da enum
    println(CARA)

    println("${soma(2, 3)} ${subtracao(4, 6)}")
}
```