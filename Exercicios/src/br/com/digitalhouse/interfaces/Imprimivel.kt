package br.com.digitalhouse.interfaces

interface Imprimivel {
    val nome: String
    val tipoDeDocumento: String

    fun imprimir()
}