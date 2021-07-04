package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Heitor"
    var cpf: String = "421.988.213-02"
    private set //somente o SET esta privado, não podendo ser atribuido nenhum valor para as propriedades

    constructor()

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"
}

fun main(){
    val heitor = Pessoa()

    println(heitor.pessoaInfo())

}