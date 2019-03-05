
## Operador cast seguro


Obs: Recomendado para casos extremos (extremos mesmo de necessidade de arranjo técnico ao meu ver, quem sou eu na fila do pão)

#### Exemplo 1

```kotlin
fun imprimirConceito(nota: Any) {
    when(nota as? Int) { // conversão segura
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}


fun main() {
    val notas = listOf(9.6, 3.8, 7.2, 5.5, 4.1)

    for (nota in notas){
        imprimirConceito(nota)
    }
}
```

#### Exemplo 2

```kotlin
fun imprimirConceito(nota: Any) {
    when(nota as? Int ?: 0) { // conversão segura, assumindo 0 quando nulo com elvis operator
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}


fun main() {
    val notas = listOf(9.6, 3.8, 7.2, 5.5, 4.1)

    for (nota in notas){
        imprimirConceito(nota)
    }
}
```