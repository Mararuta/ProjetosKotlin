fun main() {
    /* EXERCÍCIO 3

    Faça um programa que receba a idade de uma pessoa e mostre na
    saída em qual categoria ela se encontra:

    10-14 infantil
    15-17 juvenil
    18-25 adulto
    */

    print("\nDigite sua idade: ")
    val idade = readLine()!!.toInt()

    if (idade in 10..14) {
        print("Você faz parte da categoria, infantil.\n")

    } else if (idade in 15..17) {
        print("Você faz parte da categoria, Juvenil.\n")

    } else if (idade in 18..25) {
        print("Você faz parte da categoria, Adulto.\n")

    } else
        print("Você é muito cringe e não se inclui nas nossas categorias.\n")
}