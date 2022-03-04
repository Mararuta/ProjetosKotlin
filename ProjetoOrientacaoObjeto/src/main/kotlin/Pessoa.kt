/*
class Pessoa {

    //Atributos - Variáveis que nós declaramos dentro de uma classe
    //Classe Pessoa - Nome, Altura, Peso, CorDosOlhos, Raça, Signo

    var Nome = ""
    var Idade = 0
    var Altura = 0.0
    var Peso = 0.0
    var CorDosolhos = ""
    var CorDoCabelo = ""
    var Raca = ""
    var Signo = ""
    var Nacionalidade = ""
    var EstadoCivil = ""
    var Escolaridade = ""




}
*/
class Pessoa (var nome: String, var altura: Double) { //no primeiro não precisa declarar o "Construtor"


    var Idade = 0
    var Peso = 0.0
    var CorDosolhos = ""
    var CorDoCabelo = ""
    var Raca = ""
    var Signo = ""
    var Nacionalidade = ""
    var EstadoCivil = ""
    var Escolaridade = ""

    //Declarando construtores secundários
    constructor(
        nome:String, altura: Double, idade: Int, peso: Double, CorDosolhos: String
    ) : this(nome, altura){

        this.Idade = idade
        this.Peso = peso
        this.CorDosolhos = CorDosolhos

    }

    constructor(
        nome: String, altura: Double, idade: Int, peso: Double,
        CorDosolhos: String, CorDoCabelo: String, Raca: String,
        Signo: String,
    ) : this(nome, altura, idade, peso, CorDosolhos){

        this.CorDoCabelo = CorDoCabelo
        this.Raca = Raca
        this.Signo = Signo
        }

    constructor(
        nome: String, altura: Double, idade: Int, peso: Double,
        CorDosolhos: String, CorDoCabelo: String, Raca: String,
        Signo: String, Nacionalidade: String, EstadoCivil: String,
        Escolaridade: String
    ) : this (nome, altura, idade, peso, CorDosolhos, CorDoCabelo, Raca, Signo){

        this.Nacionalidade = Nacionalidade
        this.EstadoCivil = EstadoCivil
        this.Escolaridade = Escolaridade
    }
    // toString serve para printar os atributos na main. OBS: utilizar só o return
    override fun toString(): String {
        //Pode ser alterado da maneira que preferir
        return "Nome - Marcelo" +
                "\nAltura - 1.76" +
                "\nPeso - 70.0 Kg" +
                "" +
                ""
    }
}