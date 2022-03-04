fun main(args: Array<String>) {
    /*
    val Ronildo = Pessoa()

    Ronildo.Nome = "RONILDO"
    Ronildo.Idade = 25
    Ronildo.Altura = 1.76
    Ronildo.Peso = 72.0
    Ronildo.CorDosolhos = "VERDES"
    Ronildo.CorDoCabelo = "CASTANHO"
    Ronildo.Raca = "BRANCO"
    Ronildo.Signo = "CÂNCER"
    Ronildo.Nacionalidade = "BRASILEIRO"
    Ronildo.EstadoCivil = "SOLTEIRO"
    Ronildo.Escolaridade = "ENSINO SUPERIOR"


    println("Nome: ${Ronildo.Nome}")
    println("Idade: ${Ronildo.Idade}")
    println("Altura: ${Ronildo.Altura} m")
    println("Peso: ${Ronildo.Peso} Kg")
    println("Cor dos olhos: ${Ronildo.CorDosolhos}")
    println("Cor do Cabelo: ${Ronildo.CorDoCabelo}")
    println("Raça: ${Ronildo.Raca}")
    println("Nacionalidade: ${Ronildo.Nacionalidade}")
    println("Estado civil: ${Ronildo.EstadoCivil}")
    println("Escolaridade: ${Ronildo.Escolaridade}")
     */
//-----------------------------------------------------------------------------------------
    /*
    Métodos - Comportamentos (ou seja, as açoes que os onjetos dervados
    podem executar)
    */
    // Comportamentos -
    // Atributos - São caracteristicas das classe
    // Métodos - Comportamentos da classes

    // Instancias um objeto ContaBanco
    /*
    val conta = ContaBanco()

    conta.titular = "Marcelo"
    conta.tipo = 1
    conta.saldo = 5000.0

    //Chamar os métodos da conta banco

    conta.mostrarSaldo()

    print("\nDigite o valor do saque: R$ ")
    val saque = readLine()!!.toDouble()

    conta.saque(saque)
    conta.mostrarSaldo()

    print("\nDigite o valor do depósito: R$ ")
    val deposito = readLine()!!.toDouble()

    conta.deposito(deposito)
    conta.mostrarSaldo()
    */
//----------------------------------------------------------------------------------------------------
    /*
    Construtores - Vão servir par ainstanciar o objeto com as informaçõe
    obrigatórias que ele precisa
    */

    //instanciar os objetos, passando informações no construtor
    //Contrutor segue a sequencia declarada na classe
    val pessoa = Pessoa(
        "Ronildo", 1.76, 26, 70.0, "Verdes",
        "Castanho", "Branco", "Câncer", "Brasileiro",
        "Solteiro", "Ensino Superior")
    /*
    print("O nome da pessoa é: ")
    println(pessoa)
    print("Sua altura é: ")
    println(pessoa.altura)
    print("Sua idade: ")
    println(pessoa.Idade)
    print("Seu peso: ")
    println(pessoa.Peso)
    print("A cor do seus olhos são: ")
    println(pessoa.CorDosolhos)
    print("A cor do seu cabelo: ")
    println(pessoa.CorDoCabelo)
    print("Sua raça: ")
    println(pessoa.Raca)
    print("Seu signo: ")
    println(pessoa.Signo)
    print("Sua nacionalidade: ")
    println(pessoa.Nacionalidade)
    print("Seu estado civil: ")
    println(pessoa.EstadoCivil)
    print("Sua escolaridade: ")
    println(pessoa.Escolaridade)
    */

    println(pessoa)
}
