
## Estrutura de condições (if/else) com range

Obs: O range deve ser sempre do menor para o maior

#### Exemplo

```kotlin
fun main() {
    val nota: Double = 8.99

    // Usado operador range
    if(nota in 9..10){
        println("Fantástico")
    }else if (nota in 7..8){
        println("Parabéns")
    }else if(nota in 4..6){
        println("Tem como recuperar")
    }else if(nota in 0..3){
        println("Te vejo no próximo semestre")
    }else{
        println("Nota inválida")
    }

    println(5 in 4..7)
}
```
