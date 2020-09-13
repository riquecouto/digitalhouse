package br.com.digitalhouse.uml

fun main() {
    val registro = RegistroRecebimentos()
    val venda1 = ItemVenda("Bananas", 5, 5.00)
    val venda2 = ItemVenda("Laranjas", 3, 4.00)
    val servico1 = Servico("Pintura", 10, 20.00)

    registro.adicionarRecebimento(venda1)
    registro.adicionarRecebimento(venda2)
    registro.adicionarRecebimento(servico1)

    registro.apresentarRecebimentos()
}