
## Estrutura de repetição "while"

Obs: Não houveram mudanças

#### Exemplo

```kotlin
fun main() {
    var opcao: Int = 0

    while(opcao != -1){
        var line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você excolheu a opção $opcao")
    }

    println("Até a próxima!")
}
```
