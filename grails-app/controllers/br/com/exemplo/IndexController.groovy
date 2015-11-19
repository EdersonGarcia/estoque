package br.com.exemplo

import grails.plugin.springsecurity.annotation.Secured


@Secured(['permitAll'])
class IndexController {

    def index() {}
}
