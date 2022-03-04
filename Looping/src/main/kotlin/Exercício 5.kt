fun main(){
    /*
    Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    No final, mostre a soma dos números digitados.(DO...WHILE)
    */
    var soma: Int = 0

    do{
        print("Digite um numero: ")
        val num = readLine()!!.toInt()
        soma += num

    }
    while(num != 0)

        println("\nA soma dos valores digitados é $soma")



}
