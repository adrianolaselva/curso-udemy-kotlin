
## Template strings

- Interpolação, substitução de valores dentro de string

#### Exemplo de interpolação

```kotlin
fun main() {
    val aprovados = listOf("Jõão", "Maria", "Pedro")
    print("O primeiro colocado foi ${aprovados[0]}")
    println("O primeiro colocado foi ${aprovados}") //Imprime o array
}
```