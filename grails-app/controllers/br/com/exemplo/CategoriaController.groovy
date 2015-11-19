package br.com.exemplo

import grails.converters.JSON

class CategoriaController {
    def meuService

    static scaffold = Categoria

    def cadastrar(){

    }
    def salvar (){

        def descricao = params.descricao

        if(descricao){
            def categoria = new Categoria(descricao: descricao)
            categoria.save()

        }

    }

    def mostrar (){

        def idCategoria = params.id

        [categoria: meuService.buscaCategoria(idCategoria)]


    }

    def listarTodos(){
        def categoria = Categoria.list()


        [categorias:categoria]
    }


    def buscar(){
        def descricaoP = params.descricao
        def categoriaEncontrada = Categoria.findAll()
            render categoriaEncontrada
    }
}

