
## Varargs Int...


#### Exemplo

```kotlin
fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main() {
    for(n in ordenar(44,78,1, 3, 88)){
        print("$n\t")
    }
}
```
