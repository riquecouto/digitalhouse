package br.com.digitalhouse.uml

class RegistroRecebimentos {
    var total: Double = 0.00
    val lista = arrayListOf<IRecebivel>()

    fun adicionarRecebimento (r: IRecebivel) = lista.add(r)

    fun apresentarRecebimentos (){
        for (IRecebivel in lista) {
            total += IRecebivel.totalizarReceita()
            println(IRecebivel.toString())
        }
        println("------------------------------------------")
        println("Total: R$ ${"%.2f".format(total)}")
    }
}