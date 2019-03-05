
## Múltiplos retornos


#### Exemplo

```kotlin
/**
 * Exemplo e retorno de multiplos retornos
 */
fun agora(): Horario {
    val agora = Calendar.getInstance()

    /**
     * Função inline :)
     */
    with(agora) {
        return Horario(get(Calendar.HOUR), Calendar.MINUTE, Calendar.SECOND)
    }
}

fun main() {
    /**
     * Operador destructuring
     */
    val (h, m, s) = agora()

    println("$h:$m:$s")
}
```
