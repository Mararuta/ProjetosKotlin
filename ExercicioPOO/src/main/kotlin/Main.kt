fun main(args: Array<String>) {
    /*
    1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
    informações deste objeto no console.
     */
    /*
    println("* * * CADASTRO NOVO CLIENTE * * *")

    print("\nDigite o nome completo: ")
    var nome = readLine()!!

    print("Digite a idade: ")
    var idade = readLine()!!.toInt()

    print("Digite o telefone: ")
    var tel = readLine()!!.toString()

    print("Digite o endereço: ")
    var endereço = readLine()!!

    print("Digite o bairro: ")
    var bairro = readLine()!!

    print("Digite a cidade: ")
    var cidade = readLine()!!

    print("Digite o estado: ")
    var estado = readLine()!!


    var cliente = Cliente(nome, idade, tel, endereço, bairro, cidade, estado)

    println("---------------------------------------------")
    println("\n * * * PARA FINALIZAR DO CADASTRO APERTE ENTER * * *")
    readLine()

    cliente.entrada()
    */
    var motor = true
    var manche = true
    var asa = true
    var tremDePouso = true

    var aviao = Avião(motor, manche, asa, tremDePouso)

    aviao.piloto = true
    aviao.verificar1()

    aviao.gasolina = false
    aviao.ligar()

    println("Avião abastecido.\n")

    aviao.gasolina = true
    aviao.ligar()

    println("Avião ligado.")

    aviao.passageiro = false
    aviao.veriPassageiro()

    println("Os passageiros entraram.\n")

    aviao.passageiro = true
    aviao.veriPassageiro()

    aviao.saida()











}



