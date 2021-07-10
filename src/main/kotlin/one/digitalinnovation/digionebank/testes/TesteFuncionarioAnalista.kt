package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val hari = Analista("Harielson", "437.456.725-21", salario = 2000.00)
    println("****IMPRIMIR RELATORIO GERENTE****")
    imprimirRelatorioFuncionario.imprimir(hari)

}
