package animal

class Cavalo (nome: String, idade: Int,) : Animal(nome, idade) {
    override fun emitirSom() {
        println("IIIIIIIIRIRIRIRIRIRIRI")
    }

    fun correr(){
        println("Correndo com o espiro livre")
    }
}