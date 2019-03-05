
## Template strings

- Interpolação, com condição

#### Exemplo de interpolação

```kotlin
fun main() {
    val bomHumor = true
    print("Hoje estou ${if (bomHumor) "feliz" else "chateado"}")
}
```