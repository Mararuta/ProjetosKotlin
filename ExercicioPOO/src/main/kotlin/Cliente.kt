class Cliente(var nome: String, var idade: Int, var tel: String, var endereço: String,
              var bairro: String, var cidade: String, var estado: String) {
    /*
    1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
    informações deste objeto no console.
    */

    fun entrada(){
        println("CLIENTE CADASTRADO.")
        println("---------------------------------------------")
        println(toString())

    }
            override fun toString(): String {
            return "\n* * * APRESENTAÇÃO DE DADOS * * *\n" +
                    "\n Nome - $nome" +
                    "\n Idade - $idade Anos" +
                    "\n Endereço - Rua $endereço, $bairro - $cidade, $estado" +
                    "\n Telefone - (11) $tel"
        }




}
