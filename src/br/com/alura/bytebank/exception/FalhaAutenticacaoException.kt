package br.com.alura.bytebank.exception

class FalhaAutenticacaoException (
    mensagem: String = "Falha Autenticação"
) : Exception(mensagem)