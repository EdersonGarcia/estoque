package br.com.exemplo

import grails.transaction.Transactional

@Transactional
class MeuService {

    def buscaCategoria(def id) {
        def categoria = Categoria.get(id)
        categoria
    }
}
