fun main() {
    /*
    val mapUsuarios = mapOf(
        1 to "Marcelo",
        2 to "Henrique",
        3 to "Bruce Wayne"
    )

    for (i in mapUsuarios ){
        println(i.value)
        // .value para apresentar sómente o valor pro usuário. Ex: Strings, valores etc.
        //.key para apresentar somente a chave para o usuário, Ex: 1, 2, 3 whatever
    }
    */
//-------------------------------------------------------------------------------------------------------------
    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    - Armazenar dados da List
    - Remover dados da list;
    - Atualizar dados da list.
    - Apresentar todos os dados da list.

    */

    val dados = mutableListOf<String>()
    var nomeProd: String
    while(true) {
        println("--------- ESTOQUE DA LOJA GENERATION ---------")

        println("1 - Adicionar itens ao estoque: ")
        println("2 - Atualizar itens do estoque: ")
        println("3 - Remover itens do estoque: ")
        println("4 - Verificar itens do estoque: ")
        println("5 - Sair ")

        println("----------------------------------------------")

        print("Escolha uma opção: ")
        val opc = readLine()!!.toInt()

        when (opc) {
            1 -> {
                print("\nDigite o nome do produto para adicionar no estoque: ")
                nomeProd = readLine()!!

                if (nomeProd.isEmpty()) {
                    println("Inválido. Por favor digite um nome válido!")

                } else {
                    dados.add(nomeProd)

                }
            }

            2 -> {
                print("Digite o item que quer atualizar: ")
                nomeProd = readLine()!!

                if (nomeProd.isEmpty()) {
                    println("Inválido. Por favor digite um nome válido!")

                } else {
                    if (dados.contains(nomeProd)) {
                        val posicaoItem = dados.indexOf(nomeProd)

                        print("digite o novo item: ")
                        nomeProd = readLine()!!

                        if (nomeProd.isEmpty()) {
                            println("Valor inválido!")

                        } else {
                            dados[posicaoItem] = nomeProd
                            println("Item adicionado com sucesso!")
                        }
                    } else {
                        println("Esse item não existe na lista!")

                    }
                }

            }
            3 -> {
                println("-----------------------------------------")

                print("Digite o nome do item que quer remover: ")
                nomeProd = readLine()!!

                if (nomeProd.isEmpty())
                    println("Valor inválido!")

                if (dados.contains(nomeProd)) {
                    dados.remove(nomeProd)
                    println("Item $nomeProd foi removido com sucesso\n")

                } else {
                    println("O produto $nomeProd não existe na lista.\n")
                }
            }
            4 -> {
                if(dados.isEmpty()){
                    println("O estoque está vazio")
                }else{
                    println("\nITENS DO ESTOQUE")

                    dados.forEach{
                        println(it)
                    }
                }
            }
            5 -> break

        }
    }
            println("OS  ITENS DA LISTA AGORA SÃO $dados")

}


