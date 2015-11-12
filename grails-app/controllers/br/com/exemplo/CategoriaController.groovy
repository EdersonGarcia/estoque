package br.com.exemplo

import grails.converters.JSON

class CategoriaController {

    static scaffold = Categoria

    def cadastrar (){

        def descricao = params.descricao

        if(descricao){
            def categoria = new Categoria(descricao: descricao)
            categoria.save()

        }

    }

    def mostrar (){

        def idCategoria = params.id
        def categoria = Categoria.get(idCategoria)

        [categoria:categoria]



    }


    def buscar(){
        def descricaoP = params.descricao
        def categoriaEncontrada = Categoria.findAll()
            render categoriaEncontrada
    }
}

