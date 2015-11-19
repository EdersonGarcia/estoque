package br.com.exemplo

import com.exemplo.Usuario
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])

class UsuarioController {

    static scaffold = Usuario
}
