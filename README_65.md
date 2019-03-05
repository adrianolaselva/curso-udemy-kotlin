
## Função como parâmetro (funções anônimas) filtro para lista


#### Exemplo

```kotlin
fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()

    for(e in lista){
        if(filtro(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresletras(nome: String): Boolean = nome.length == 3


fun main() {
    val nomes = listOf("Ana", "Pedro", "Gui", "Rebeca")

    println(filtrar(nomes, ::comTresletras))
}
```
