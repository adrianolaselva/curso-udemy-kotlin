
## Estrutura "break" rotulada


Obs: Recomendado para casos extremos (extremos mesmo de necessidade de arranjo técnico ao meu ver, quem sou eu na fila do pão)

#### Exemplo

```kotlin
fun main() {
    externo@for (i in 1..15){
        for(j in 1..15){
            if(i == 2 && j == 9) break@externo
            println("$i $j")
        }
    }
}
```

#### Saída
```kotlin
1 1
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
1 11
1 12
1 13
1 14
1 15
2 1
2 2
2 3
2 4
2 5
2 6
2 7
2 8
```