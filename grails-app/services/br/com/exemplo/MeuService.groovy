package br.com.exemplo

import grails.transaction.Transactional

@Transactional
class MeuService {
    def springSecurityService

    def buscaCategoria(def id) {
        def categoria = Categoria.get(id)
        categoria
    }

    def retornaUsuarioOnline(){
         springSecurityService.getCurrentUser()
    }
}
