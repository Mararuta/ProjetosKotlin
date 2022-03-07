    /*
    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e
    pelo menos mais duas opções de construtores conforme sua percepção,com os
    atributos: nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
    */

class Cliente(private var nome: String) {

    init {

        if (nome.isEmpty()) {
            throw Exception("Nome incorreto!")

        }
    }

    private var endereço = ""
    private var telefone = ""
    private var lista = mutableListOf<String>()

    constructor(
        nome: String, endereço: String
    ) : this(nome) {
        this.endereço = endereço

    }

    constructor(
        nome: String, endereço: String, telefone: String
    ) : this(nome, endereço) {
        this.telefone = telefone

    }

    fun addLista(item: String) {

        if (item.isEmpty()) {
            println("Valor invalido")
        } else if (lista.contains(item)) {
            lista.add(item)
            println("o item $item foi adicionado com sucesso")
        } else {
            println("o item $item não existe na lista")

        }

    }

    fun removeLista(item: String) {

        if (item.isEmpty()) {
            println("Valor invalido")
        } else if (lista.contains(item)) {
            lista.remove(item)
            println("o item $item foi removido com sucesso")
        } else {
            println("o item $item não existe na lista")
        }
    }

    fun mostrarLista() {
        lista.forEach {
            println(it)

        }
    }

    init {

        if (nome.isEmpty()) {
            throw Exception("Nome incorreto!")

        }
    }
}








