import com.exemplo.Permissao
import com.exemplo.Usuario
import com.exemplo.UsuarioPermissao
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if (Environment.current == Environment.DEVELOPMENT) {
            println("Ambiente de Desenvolvimento, verificando BD ...")

            if (Usuario.count < 1 && Permissao.count < 1 && UsuarioPermissao.count() < 1) {
                println "criando Usuario Padrão"
                def adminRole = new Permissao('ROLE_ADMIN').save(flush: true)
                def userRole = new Permissao('ROLE_USUARIO').save(flush: true)

                def testUser = new Usuario("admin","admin")
                // Caso esteja usando a base preenchida, pode ser que a linha abaixo de erro

                testUser.save(flush: true, failOnError: true)

                UsuarioPermissao.create testUser, adminRole, true

                assert Usuario.count() == 1
                assert Permissao.count() == 2
                assert UsuarioPermissao.count() == 1
                println "criado: $adminRole $userRole $testUser"
            } else {
                println("Usuario Padrao ja cadastrado")
            }
        }

    }
    def destroy = {
    }
}
