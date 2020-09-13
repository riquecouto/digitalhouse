package br.com.digitalhouse.uml

class ItemVenda(val produto: String, val quantidade: Int, val valor: Double): IRecebivel {

    override fun totalizarReceita(): Double {
        return valor*quantidade
    }

    override fun toString(): String {
        return "$produto - $quantidade x R$ ${"%.2f".format(valor)} = R$ ${"%.2f".format(totalizarReceita())}"
    }
}