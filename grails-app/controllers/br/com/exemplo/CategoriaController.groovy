package br.com.exemplo

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class CategoriaController {
    def meuService

//        static defaultAction = "listarTodos"
    @Secured(['ROLE_ADMIN'])
   def index(){
        println (meuService.retornaUsuarioOnline())
        render Categoria.list()
    }
    @Secured(['ROLE_USUARIO','ROLE_ADMIN'])
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

