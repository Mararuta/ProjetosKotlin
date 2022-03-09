fun main() {
    /*
        print("Digite seu nome para vê-lo em letras maiúsculas: ")
        var nome = readLine()!!

        print("seu nome em letras maiúsculas é: ${letrasMaiusculas(nome)}")
        */

    var multi = Calculadora()
    var divi = Calculadora()
    var soma = Calculadora()
    var sub = Calculadora()

        while (true) {
        var opc: Int = 0
        print("\n1 - Multiplicação \n2 - Divisão \n3 - Soma \n4 - Subtração \n5 - Sair ")
        print("\nDigite o numero da operação desejada: ")
        opc = readLine()!!.toInt()

        when (opc){
                5 -> break
            }

        print("Digite o numero que você quer: ")
        var num = readLine()!!.toInt()
        print("Digite o numero por quanto você quer operar: ")
        var numOpc = readLine()!!.toInt()

        when (opc) {

            1 -> println("\nO resultado da operação selecionada é ${Calculadora.multi(num, numOpc)}")
            2 -> println("\nO resultado da operação selecionada é ${Calculadora.divi(num, numOpc)}")
            3 -> println("\nO resultado da operação selecionada é ${Calculadora.soma(num, numOpc)}")
            4 -> println("\nO resultado da operação selecionada é ${Calculadora.sub(num, numOpc)}")
        }
    }
}
