package br.com.exemplo

class Categoria {

    String descricao
    static hasMany = [produtos:Produto]

    static constraints = {
    }

    String toString(){
        " Id:$id - $descricao"
    }
}
