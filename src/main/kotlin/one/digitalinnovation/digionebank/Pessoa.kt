package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Heitor"
    var cpf: String = "421.988.213-02"
}

fun main(){
    val totor = Pessoa()

    println(totor.nome)
    println(totor.cpf)
}