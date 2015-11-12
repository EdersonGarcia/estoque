package br.com.exemplo

class Produto {

    String nome
    String descricao
    static belongsTo = [categoria:Categoria]


    static constraints = {
        nome()
        categoria nullable: true
    }

    String toString(){
        "$id - $nome"
    }
}
