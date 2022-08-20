package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro

//    enderecoNulo.let { println(it?.logradouro) }

    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
    }
}
