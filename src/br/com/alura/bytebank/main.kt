package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.teste.testaComportamentosConta

fun main() {
//    println("inicio main")
//    funcao1()
//    println("fim main")
    testaComportamentosConta()
}

fun funcao1() {
    println("inicio funcao1")
    try {
        funcao2()
    } catch (e: ArithmeticException) {
        e.printStackTrace()
        println("ArithmeticException")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for(i in 1..5) {
        //val divisao = i / 0
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}