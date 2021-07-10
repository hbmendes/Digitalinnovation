package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val ana = Gerente("Ana Bruna", "437.456.725-21", salario = 2000.00, senha = "1234")
    println("****IMPRIMIR RELATORIO GERENTE****")
    imprimirRelatorioFuncionario.imprimir(ana)

    TesteAutenticacao().autentica(ana)
}
