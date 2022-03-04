fun main(){

    /*
    escreva um programa que receba qualquer numero e indentifique os impares e os multiplos 2.
    Pare o programa quando digitar 0.
    */

    var par = 0
    var impar = 0



    for(i in 1..10) {
        print("Digite um numero até 10: ")
        val i = readLine()!!.toInt()

        if (i % 2 == 0) {
            par++
        } else {
            impar++
        }
    }
    println("A quantidade de numeros impares digitados fora $impar")
    println("A quantidade de numeros par digitados fora $par")
    /*
    if (num % 3 == 0) {
        cont++
    } else if (num % 2 == 0) {
        cont++

    } else println("Fim do programa.")

    println("os numeros multiplos de 2 são os, $num")
    */

}
