package br.com.alura.bytebank

import java.lang.NumberFormatException

fun main() {
    val entrada: String = "1.9"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }

    // println("inicio main")
    // val entrada: String = "1,9"
//    try {
//        val valor: Double = entrada.toDouble()
//        println("valor recebido: $valor")
//    } catch (e: NumberFormatException) {
//        println("Problema na conversão")
//        e.printStackTrace()
//    }
    // funcao1()
    // println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for(i in 1..5) {
        try {
            val divisao = i / 0
            println("Divisão: $divisao")
        }
        catch (e: ArithmeticException) {
            println("Não é possível dividir por zero.")
            e.printStackTrace()
        }
        println(i)
    }
    println("fim funcao2")
}