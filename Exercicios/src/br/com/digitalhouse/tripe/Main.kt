package br.com.digitalhouse.tripe

fun main() {
    val tripe = Tripe(false, 50, 200, 55)

    println(tripe)
    tripe.desdobrar()

    println(tripe)
    tripe.definirAltura(165)
    println(tripe)

    tripe.prontoParaGuardar()
    println(tripe)

    tripe.usar()
    println(tripe)

    tripe.definirAltura(255)
    println(tripe)
}