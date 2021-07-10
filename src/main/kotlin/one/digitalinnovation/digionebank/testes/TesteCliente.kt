package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo


fun main(){
    val heitor = Cliente(
        nome = "Heitor Henrique",
        cpf = "421.123.641-21",
        clienteTipo = ClienteTipo.PF,
        senha = "1234"
    )
    println(heitor)

    TesteAutenticacao().autentica(heitor)
}
