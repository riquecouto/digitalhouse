package br.com.digitalhouse.tripe

class Tripe (var dobrado: Boolean, val alturaMinima: Int, val alturaMaxima: Int, var alturaAtual: Int) {

    fun definirAltura(novaAltura: Int) {
        if (novaAltura > alturaMaxima || novaAltura < alturaMinima) {
            println("Altura inválida")
            return
        }
        alturaAtual = novaAltura
    }

    fun dobrar() {
        dobrado = true
    }

    fun desdobrar() {
        dobrado = false
    }

    fun guardar() {
        dobrar()
        alturaAtual = alturaMinima
    }

    fun prontoParaGuardar(): Boolean {
        return (dobrado && alturaAtual == alturaMinima)
    }

    fun usar() {
        desdobrar()
        alturaAtual = alturaMaxima/2
    }

    fun prontoParaUsar(): Boolean {
        return (!dobrado && alturaAtual >= alturaMaxima/2)
    }
}