package br.com.exemplo

class ExemploTagLib {
//    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    static namespace = "exemplo"


    def colocaH1 = {  attrs, body ->
        def text = attrs.text
        out << "<h1> $text </h1>"

        out << "<h2> ${body()} </h2>"

    }

    def criarMenu = { attrs ->
        def menus = attrs.menus
        out << """

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Home</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
            """
         menus.each {menu->
              out << ' <li><a href="#"> '
             out << menu
             out <<'<span class="sr-only">(current)</span></a></li>'

         }
    out << """    </ul>

        </div><!-- /.navbar-collapse -->
        </div>
</nav>

"""

    }
}
