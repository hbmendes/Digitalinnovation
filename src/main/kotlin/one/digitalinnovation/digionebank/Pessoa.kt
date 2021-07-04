package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Heitor"
    var cpf: String = "421.988.213-02"

    inner class Endereço(){
        var rua: String = "Rua Doze"
    }
}

fun main(){
    val heitor = Pessoa()

    println(heitor.nome)
    println(heitor.cpf)

    println(heitor.Endereço().rua)
}