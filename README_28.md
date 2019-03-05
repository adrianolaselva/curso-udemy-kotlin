
## Estrutura de condições (if/else) com expressão

Obs: O Kotlin não permite operador ternário

#### Exemplo

```kotlin
fun main() {
    val num1: Int = 6
    val num2: Int = 3

    val maiorValor = if(num1 > num2) {
        println("processando...")
        num1
    }else{
        println("processando...")
        num2
    }

    println("O maior valor é $maiorValor.")
}
```

```kotlin
fun main() {
    val num1: Int = 6
    val num2: Int = 3

    val maiorValor = if(num1 > num2) num1 else num2

    println("O maior valor é $maiorValor.")
}
```