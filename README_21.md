
## Operador de chamada segura safe call operator

Obs: Operador ? (val a: Int? = null) safe call operator (Operador de chamada segura)

#### Exemplo

```kotlin
fun main() {
    var a: Int? = null //safe call operator
    println(a?.dec())
}
```