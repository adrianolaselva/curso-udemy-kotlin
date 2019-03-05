
## Adição de função em apis


#### Exemplo

No exemplo abaixo estou adicionando uma função chamada "secondOrNull" na classe List do java

```kotlin
/**
 * Acrescenta funções na API padrão
 */
fun <E> List<E>.secondOrNull(): E? = if(this.size>2) this.get(1) else null

fun main() {
    var item: String? = listOf("teste1", "teste2", "teste3").secondOrNull()
    println("Segundo elemento da lista: $item")
}
```
