
## Operador elvis

Utiliado quando se tenta atribuir um valor nulo para uma variável sem o safe call operator definido, 
assim deixando definido um valor padrão quando for nulo

A grosso modo funciona com um operador ternário, porém com propósitos completamente distintos

#### Exemplo

```kotlin
fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor padrão"

    println(obrigatorio)
}
```