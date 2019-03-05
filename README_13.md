
## Usando constantes

#### é utilizado o tipo val para determinal variáveis constantes, o script abaixo irá gerar exceção
```kotlin
fun main(args: Array<String>) {
    val a: Int = 1
    val b = 2 //Tipo inferido

    a = a + b

    print(a)
}
```