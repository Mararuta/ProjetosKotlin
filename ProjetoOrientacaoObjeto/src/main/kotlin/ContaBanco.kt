class ContaBanco {

    /*
    Atributos - Titular, Tipo, Banco, Saldo
    Métodos - Saque, Depósito e Saldo
    */

    var titular = ""
    var tipo = 0 //1 = Conta Corrente - 2 = Conta Poupança
    var saldo = 0.0
    var banco = ""

    //Declarar os métodos ou comportamentos
    //Métodos - Saque, Depósito e Saldo
    //Declarar os métodos através de funções dentro da classe

    fun mostrarSaldo(){
        println("\nO saldo da sua conta é R$$saldo")
    }

    fun deposito (valor:Double) {

        if (valor <= 0) {
            println("Depósito impossível de ser realizado!")

        } else {
            saldo += valor
            println("Depósito de R$$valor realizado com sucesso!")
        }
    }

    fun saque (valor: Double){

        if (saldo <= 0){
            println("Saldo insuficiente.")

        } else if (valor <= 0){
            println("Saque não pode ser realizado")

        } else if (valor > saldo) {
            println("Saldo insuficiente!")

        } else {
            saldo -= valor
            println("Saque de R$$valor, realizado com sucesso")
        }

    }



}