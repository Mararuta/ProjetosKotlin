package animal

class Preguiça (nome: String, idade: Int) : Animal(nome, idade){
    override fun emitirSom() {
        println("UUUUÑÑÑÑÑAAAAAA")
    }

    fun subirEmArvore(){
        print("subindo na arvore")
    }

}