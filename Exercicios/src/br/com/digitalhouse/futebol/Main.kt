package br.com.digitalhouse.futebol

fun main(){
    val jogador1 = JogadorDeFutebol("Pedro Paulo", 50, 10, 2, 2)
    val jogador2 = JogadorDeFutebol("Gabriel Jesus", 50, 10, 2, 2)

    val sessaoDeTreinamento = SessaoDeTreinamento(1)
    sessaoDeTreinamento.treinarA(jogador1)
    sessaoDeTreinamento.treinarA(jogador2)
}