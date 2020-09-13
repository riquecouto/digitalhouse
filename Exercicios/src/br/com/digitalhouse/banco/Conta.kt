package br.com.digitalhouse.banco

class Conta(val numero: Int, var saldo: Float, var titular: Cliente) {
    init {
        saldo = 0.0F
    }

    fun depositar(quantia: Float) {
        if (quantia <= 0) {
            println ("Valor negativo ou nulo")
            return
        }

        saldo += quantia
        println ("Depósito de R$ $quantia realizado. Seu saldo é de R$ $saldo")
    }

    fun sacar(quantia: Float) {
        if (quantia > saldo) {
            println ("Saldo insuficiente")
            return
        }

        saldo -= quantia
        println ("Saque de R$ $quantia realizado. Seu saldo é de R$ $saldo")
    }
}