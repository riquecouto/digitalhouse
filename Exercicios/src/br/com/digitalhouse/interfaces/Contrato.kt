package br.com.digitalhouse.interfaces

class Contrato (override val nome : String, override val tipoDeDocumento: String): Imprimivel {
    override fun imprimir() = println("Sou um contrato muito legal. Nome: \"$nome\", tipo: \"$tipoDeDocumento\"")
}