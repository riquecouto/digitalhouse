package br.com.digitalhouse.banco

fun main() {
    val cliente1 = Cliente("Paulo", "Soares")
    val cliente2 = Cliente("Lorena", "Albuquerque")

    val conta1 = Conta(554401, 0.0F, cliente1)
    val conta2 = Conta(554402, 0.0F, cliente2)

    conta1.depositar(150.03F)
    conta2.depositar(450.00F)

    conta1.sacar(73.03F)
    conta2.sacar(470.00F)
    conta2.sacar(410.00F)
}