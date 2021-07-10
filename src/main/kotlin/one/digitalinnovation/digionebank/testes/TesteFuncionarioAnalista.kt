package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val ana = Analista("Ana Bruna", "437.456.725-21", salario = 2000.00)
    println("****IMPRIMIR RELATORIO ANALISTA****")
    imprimirRelatorioFuncionario.imprimir(ana)

}
