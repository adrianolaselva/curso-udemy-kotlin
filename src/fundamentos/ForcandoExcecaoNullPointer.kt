package fundamentos


fun main() {
    var a: Int? = null
    println(a?.dec())

    println("Momento do erro")
    println(a!!.inc())
}