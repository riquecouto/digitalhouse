package br.com.digitalhouse.uml

class Servico(val descricao: String, val horas: Int, val precoHora: Double): IRecebivel {

    override fun totalizarReceita(): Double {
        return horas*precoHora
    }

    override fun toString(): String {
        return "$descricao - ${horas}h x R$ ${"%.2f".format(precoHora)} = R$ ${"%.2f".format(totalizarReceita())}"
    }
}