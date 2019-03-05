
## Estrutura de repetição "for" iterando arralist obtendo índice e valor


#### Exemplo

```kotlin
fun main() {
    val alunos = arrayListOf("André", "Carla", "Marcos")

    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice+1} = $aluno")
    }
}
```

#### Saída
```kotlin
1 = André
2 = Carla
3 = Marcos
```