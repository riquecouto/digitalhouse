package br.com.digitalhouse.interfaces

class Foto (override val nome : String, override val tipoDeDocumento: String): Imprimivel {
    override fun imprimir() = println("Eu sou uma selfie. Nome: \"$nome\", tipo: \"$tipoDeDocumento\"")
}