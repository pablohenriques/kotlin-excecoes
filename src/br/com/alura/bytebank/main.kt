package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro

    enderecoNulo?.let {
        println(it.logradouro.length)
    }

    teste("")
    teste(1)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
}
