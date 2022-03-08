import animal.Animal
import animal.Cachorro
import animal.Cavalo
import animal.Preguiça

fun main() {

    val krypto = Cachorro("Krypto", 7)
    val spirit = Cavalo("Spirit", 10)
    val lazy = Preguiça("Lazy", 5)

    val cachorro = ""
    val cavalo = ""
    val preguica = ""
    while (true) {
        println("* * * * *  SONS DE ANIMAIS * * * * *")
        println("1 - Cachorro")
        println("2 - Cavalo")
        println("3 - Preguiça")
        println("4 - Sair")
        println(" * * * * * * * * * * * * * * * * * * ")

        print("Escolha uma opção: ")
        val opc = readLine()!!.toInt()

        when (opc) {

            1 -> {
                println("Som do cachorro")
                krypto.emitirSom()
                println("-------------------------------------")

            }
            2 -> {
                println("\nSom do cavalo")
                spirit.emitirSom()
                println("-------------------------------------")
            }
            3 -> {
                println("\nSom da preguiça")
                lazy.emitirSom()
                println("-------------------------------------")
            }

            4 -> break
        }

    }
}