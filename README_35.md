
## Estrutura de repetição "for" incrementando de determinado quantidade de valor


#### Exemplo 1

```kotlin
fun main() {
    for(i in 0..100 step 5){
        println(i)
    }
}
```

#### Saída
```kotlin
0
5
10
15
20
25
30
35
40
45
50
55
60
65
70
75
80
85
90
95
100
```

#### Exemplo 2

```kotlin
for(i in 100 downTo 0 step 5){
    println(i)
}
```

#### Saída
```kotlin
100
95
90
85
80
75
70
65
60
55
50
45
40
35
30
25
20
15
10
5
0
```