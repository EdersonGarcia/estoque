<%--
  Created by IntelliJ IDEA.
  User: ederson
  Date: 11/12/15
  Time: 3:45 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="meuLayout"/>

    <title></title>
</head>

<body>


<div class="container">

    <div class="col-xs-3">
        <g:form action="salvar" controller="categoria">
            <div class="form-group">
                <input type="text" name="descricao" class="form-control" placeholder="Digite a Descricao da categoria">
            </div>
            <button class="btn btn-success">Criar</button>

        </g:form>
    </div>
</div>


</body>
</html>