package com.exemplo

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(['ROLE_ADMIN'])
class UsuarioPermissaoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond UsuarioPermissao.list(params), model:[usuarioPermissaoCount: UsuarioPermissao.count()]
    }

    def show(UsuarioPermissao usuarioPermissao) {
        respond usuarioPermissao
    }

    def create() {
        respond new UsuarioPermissao(params)
    }

    @Transactional
    def save() {
        def usuario = Usuario.get(params.usuario.id)
        def permissao = Permissao.get(params.permissao.id)
        def usuarioPermissao = new UsuarioPermissao(usuario,permissao)
        if (usuarioPermissao == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (usuarioPermissao.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond usuarioPermissao.errors, view:'create'
            return
        }

        usuarioPermissao.save flush:true

        redirect(action: 'index')
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.created.message', args: [message(code: 'usuarioPermissao.label', default: 'UsuarioPermissao'), usuarioPermissao.id])
//                redirect usuarioPermissao
//            }
//            '*' { respond usuarioPermissao, [status: CREATED] }
//        }
    }

    def edit(UsuarioPermissao usuarioPermissao) {
        respond usuarioPermissao
    }

    @Transactional
    def update(UsuarioPermissao usuarioPermissao) {
        if (usuarioPermissao == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (usuarioPermissao.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond usuarioPermissao.errors, view:'edit'
            return
        }

        usuarioPermissao.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'usuarioPermissao.label', default: 'UsuarioPermissao'), usuarioPermissao.id])
                redirect usuarioPermissao
            }
            '*'{ respond usuarioPermissao, [status: OK] }
        }
    }

    @Transactional
    def delete(UsuarioPermissao usuarioPermissao) {

        if (usuarioPermissao == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        usuarioPermissao.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'usuarioPermissao.label', default: 'UsuarioPermissao'), usuarioPermissao.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'usuarioPermissao.label', default: 'UsuarioPermissao'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
