package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome= nome, cpf = cpf, salario = salario), Logavel {
    override fun calcularAuxilio(): Double = salario + (salario * 0.4)

    override fun login(): Boolean ="1234" == senha

}