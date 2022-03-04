fun main(){

    menu()

    print("Digite o numero que você quer: ")
    var num1 = readLine()!!.toInt()
    print("Digite o numero por quanto você quer operar: ")
    var num2 = readLine()!!.toInt()

}

fun menu() {
    print("\n1 - Multiplicação \n2 - Divisão \n3 - Soma \n4 - Subtração ")
    print("\nDigite o numero da operação desejada: ")
    var opc = readLine()!!.toInt()

    fun mult(num1: Int, num2: Int) {
        println("a multiplicação dos valores é ${num1 * num2}")
    }

    fun div(num1: Int, num2: Int) {
        println("a divisão dos valores é ${num1 / num2}")
    }

    fun som(num1: Int, num2: Int){
        println("a soma dos valores é ${num1 + num2}")
    }

    fun subt(num1: Int, num2: Int) {
        println("a subtração dos valores é ${num1 + num2}")
    }
}