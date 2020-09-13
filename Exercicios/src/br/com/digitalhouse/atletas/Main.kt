package br.com.digitalhouse.atletas

fun main (){
    val atleta1 = Atleta("Renato Silva", 45, 60)
    val atleta2 = Atleta("Paulo Souza", 35, 70)

    val prova1 = Prova(40, 50)
    val prova2 = Prova(15, 45)
    val prova3 = Prova(60, 90)
    val prova4 = Prova(25, 20)
    val prova5 = Prova(30, 70)
    val prova6 = Prova(55, 75)

    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta1))
    println(prova4.podeRealizar(atleta2))
    println(prova5.podeRealizar(atleta2))
    println(prova6.podeRealizar(atleta2))
}