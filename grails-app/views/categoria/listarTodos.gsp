<%--
  Created by IntelliJ IDEA.
  User: ederson
  Date: 11/12/15
  Time: 4:03 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Listar Todos</title>
   <meta name="layout" content="meuLayout"/>
</head>

<body>
<g:render template="meuTemplate"/>
<div class="navbar-right">

</div>
<exemplo:colocaH1 text="Exemplo">
    asdasdasuhdasodhasoiuasiodasiod
    </exemplo:colocaH1>
    <div class="container">
     <div class="col-md-12">
         <table class="table table-striped ">
             <thead>
             <tr>
                 <th>id</th>
                 <th>descricao</th>
             </tr>
             </thead>

             <tbody>
             <g:each in="${categorias}">


                 <tr>
                     <td>${it.id}</td>
                     <td>${it.descricao}</td>
                     <td><g:link controller="categoria" action="mostrar" params="[id:it.id]">Ver</g:link> </td>

                 </tr>

             </g:each>
             </tbody>

         </table>

     </div>
 </div>
</body>
</html>