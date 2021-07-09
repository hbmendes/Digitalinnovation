package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val heitor = Pessoa(nome = "Heitor Henrique", cpf = "421.233.126-23")

    println(heitor.nome)
    println(heitor.cpf)

}