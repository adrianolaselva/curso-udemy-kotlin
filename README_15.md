
## Tipos básicos

-   byte => 1 byte (8bits)
-   short => 2bytes (16bits)
-   int => 4bytes (32bits)
-   long => 8bytes (64bits)

Obs: e vão de positivos para negativos

#### 8 tipos pseudo primitivos do kotlin, na verdade todos os tipos em kotlin são objetos

```kotlin
fun main(args: Array<String>) {

    // Tipos numéricos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807 //Long.MAX_VALUE

    //Tipos numérios reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo caractere
    val char: Char = '?' // Outros exemplos... '1', 'g', ' ', ...

    val boolean: Boolean = true // ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(9_223_372_036_854_775_807 is Long)
    println(1.0 is Double)
    println(10.dec())

    /**
     * ############################################################
     */
}
```