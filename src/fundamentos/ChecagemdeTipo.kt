package fundamentos

fun main() {
    val valor: Any = "abc" //Tipo Any genérico

    if(valor is String){
        println(valor)
    } else if (valor !is String){ //apenas para mostrar um exemplo de negação do is :)
        println("Não é uma string")
    }
}