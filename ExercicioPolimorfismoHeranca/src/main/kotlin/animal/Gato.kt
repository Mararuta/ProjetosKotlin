package animal

class Gato (nome: String, idade: Int) : Animal(nome, idade) {
    override fun emitirSom() {
        println("MIIIIIIIIIAAAAAAAAAAAAAAAAAAAUU")

    }

    fun gatoCorrendo (){
        println("Gato não corre ele desfila, Respeite.")
    }
}