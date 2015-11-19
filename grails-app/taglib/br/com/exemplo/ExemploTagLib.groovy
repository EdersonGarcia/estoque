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
}
