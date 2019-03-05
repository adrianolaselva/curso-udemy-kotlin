
## Forçando um nullpointer exception

Obs: Ao contrário do operador "?" (safe call operator) com o operador "!!" você assume um possivel erro de nullpointer

#### Exemplo

```kotlin
fun main() {
    var a: Int? = null
    println(a?.dec())

    println("Momento do erro")
    println(a!!.inc())
}
```