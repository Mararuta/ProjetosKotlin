fun main() {

  var nome = ""
  var endereco = ""
  var telefone = ""

  val cliente = Cliente(nome, endereco, telefone)


  try {
    nome = readLine()!!

  }catch (e:Exception){
    println(e.message)
  }

    cliente.addLista("arroz")

    cliente.mostrarLista()
    cliente.removeLista("carne")
    cliente.mostrarLista()


}