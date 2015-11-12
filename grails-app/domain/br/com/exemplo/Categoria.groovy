package br.com.exemplo

class Categoria {

    String descricao

    static constraints = {
    }

    String toString(){
        "$id - $descricao"
    }
}
