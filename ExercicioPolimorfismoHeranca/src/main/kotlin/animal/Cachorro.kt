package animal

class Cachorro(nome: String, idade: Int) : Animal(nome, idade){
    override fun emitirSom() {
        println("Au Au Au!")
    }

    fun correr (){
        print("Correndo atrás da moto")
    }

}