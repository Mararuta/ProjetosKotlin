fun main(){

    //    2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var par = 0
    var impar = 0


    for (i in 1..10){
        print("Digite um número: ")
        val i = readLine()!!.toInt()

        if (i % 2 == 0){
            par++

        }else{
            impar++

        }

    }

    println("A quantidade número pares digitados foi de $par")
    println("A quantidade número ímpares digitados foi de $impar")

}