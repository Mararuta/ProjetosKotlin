class Avião(var motor: Boolean, var manche: Boolean,
            var asas: Boolean, var tremDePouso: Boolean) {
    /*
    2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto avião, defina as instancias deste objeto e apresente as
    informações deste objeto no console.
    */
    var piloto = false
    var passageiro = false
    var gasolina = false

    //verificar1
    fun verificar1() {
        if (piloto) {
            println("\nLigue o avião")
        } else {
            println("\nAvião não tem piloto")
        }
    }

    //Ligar
    fun ligar() {
        if (gasolina) {
            println("\nLigar motor")

        } else {
            println("\nPrecisa abastecer")

        }
    }
    fun saida(){
        println(toString())
    }

    //Verificar
    fun veriPassageiro() {
        if (passageiro) {
            println("\nPreparar para decolagem\n")
        } else {
            println("\nNão ira decolar pois está sem passageiros")
        }
    }


    override fun toString(): String {
        return " O piloto está no avião? $piloto" +
                "\n O avião tem gasolina? $gasolina" +
                "\n O avião tem passageiros? $passageiro" +
                "\n----------------------------------------" +
                "\n    * * * DECOLAR * * * "
    }
}