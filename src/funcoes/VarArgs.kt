package funcoes

fun ordenar(vararg numeros: Int, a: Int? = null): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main() {
    for(n in ordenar(44,78,1, 3, 88, a = 99)){
        print("$n\t")
    }
}