import kotlin.math.*

fun main() {

    /*EXERCÍCIO 4

    Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
    Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
    */

    print("\nDigite um número: ")
    val num = readLine()!!.toDouble()

    if (num % 2 == 0.0 && num % 3 != 0.0) {
        println("o número digitado foi $num e sua raiz quadrada é ${sqrt(num)}")

    } else
        println("o número digitado foi $num e o mesmo elevado ao quadrado é ${num.pow(2)}")
}