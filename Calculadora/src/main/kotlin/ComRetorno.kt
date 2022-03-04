fun main() {
    /*
    print("Digite seu nome para vê-lo em letras maiúsculas: ")
    var nome = readLine()!!

    print("seu nome em letras maiúsculas é: ${letrasMaiusculas(nome)}")
    */

    var opc: Int = 0

    print("\n1 - Multiplicação \n2 - Divisão \n3 - Soma \n4 - Subtração ")
    print("\nDigite o numero da operação desejada: ")
    opc = readLine()!!.toInt()

    print("Digite o numero que você quer: ")
    var num = readLine()!!.toInt()
    print("Digite o numero por quanto você quer operar: ")
    var numOpc = readLine()!!.toInt()

    when (opc) {
        1 -> println("\nO resultado da operação selecionada é ${multi(num, numOpc)}")
        2 -> println("\nO resultado da operação selecionada é ${divi(num, numOpc)}")
        3 -> println("\nO resultado da operação selecionada é ${soma(num, numOpc)}")
        4 -> println("\nO resultado da operação selecionada é ${sub(num, numOpc)}")
    }
}

    fun multi(num:Int, numOpc:Int): Int{
        return num * numOpc
    }
    fun divi(num:Int, numOpc:Int): Int{
    return num / numOpc
    }
    fun soma(num:Int, numOpc:Int): Int{
    return num + numOpc
    }
    fun sub(num:Int, numOpc:Int): Int{
    return num - numOpc
    }