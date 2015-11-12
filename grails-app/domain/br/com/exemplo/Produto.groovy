package br.com.exemplo

class Produto {

    String nome
    String descricao
    Categoria categoria


    static constraints = {
        nome()
        categoria nullable: true
    }

    String toString(){
        "$id - $nome"
    }
}
