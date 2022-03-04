fun main(){
    /*
    Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
    */

    var soma = 0.0
    var cont: Int = 0

    do{
        print("Digite um numero: ")
        val num = readLine()!!.toInt()

        if(num %3 == 0 && num != 0)
            cont++
            soma += num

    }
    while(num != 0)

    val media = soma / cont

        println("\nsão multiplos de 3 apenas $cont numeros")
        println("A média dos valores digitados multiplos de 3 é: $media")
}

