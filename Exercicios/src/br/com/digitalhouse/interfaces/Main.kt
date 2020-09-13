package br.com.digitalhouse.interfaces

fun main() {
    val documento = Documento("Formulario", ".docx")
    val foto = Foto("Praia", ".jpg")
    val contrato = Contrato("Contrato", ".pdf")
    val impressora = Impressora()

    impressora.adicionarLista(documento)
    impressora.adicionarLista(foto)
    impressora.adicionarLista(contrato)

    impressora.imprimirTudo()
}