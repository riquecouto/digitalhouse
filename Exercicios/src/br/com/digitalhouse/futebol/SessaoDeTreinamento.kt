package br.com.digitalhouse.futebol

class SessaoDeTreinamento (var experiencia: Int) {

    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        print ("A experiencia passou de ${jogador.experiencia} para ")
        jogador.experiencia += experiencia
        println ("${jogador.experiencia}.")
    }
}