package br.com.digitalhouse.interfaces

class Impressora {
    private val listaimprimivel = mutableListOf<Imprimivel>()

    fun adicionarLista(item: Imprimivel) = listaimprimivel.add(item)

    fun imprimirTudo() {
        for (item in listaimprimivel) {
            item.imprimir()
        }
        listaimprimivel.clear()
    }
}