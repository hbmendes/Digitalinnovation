package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Banco


fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "BankOne", numero = 30)
    println(banco2.info())
}