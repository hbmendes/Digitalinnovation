package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario


class imprimirRelatorioFuncionario{
    companion object{
        fun imprimir(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}