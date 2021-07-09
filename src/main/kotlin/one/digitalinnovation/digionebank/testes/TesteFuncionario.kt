package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val heitor = Pessoa(nome = "Heitor Henrique", cpf = "421.233.126-23")
    println(heitor.nome)
    println(heitor.cpf)

    val ana = Funcionario("Ana Bruna", "437.456.725-21", salario = BigDecimal.valueOf(200.00))
    println(ana.nome)
    println(ana.cpf)
    println(ana.salario)

}