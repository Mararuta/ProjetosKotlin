fun main(){

    /* EXERCÍCIO 2

    Faça um programa que entre com três números e coloque em ordem crescente.
    */
    /*
    n1, n2, n3
    n1, n3, n2
    n2, n1, n3
    n2, n3, n1
    n3, n1, n2
    n3, n2, n1
    */

    print("Digite o primeiro número: ")
    var n1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    var n2 = readLine()!!.toInt()
    print("Digite o terceiro número: ")
    var n3 = readLine()!!.toInt()

    if(n1 >= n2 && n1 >= n3) {
        println("$n1 - $n2 - $n3")

    }else if(n1 >= n3 && n1 >= n2) {
        println("$n1 - $n3 - $n2")

    }else if(n2 >= n1 && n2 >= n3) {
        println("$n2 - $n1 - $n3")

    }else if(n2 >= n3 && n2 >= n1) {
        println("$n2 - $n3 - $n1")

    }else if(n3 >= n1 && n3 >= n2) {
        println("$n3 - $n1 - $n2")

    }else{
        println("$n3 - $n2 - $n1")
    }
}
