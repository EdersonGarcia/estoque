<%--
  Created by IntelliJ IDEA.
  User: ederson
  Date: 11/12/15
  Time: 4:03 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <asset:javascript src="jquery-2.1.3.js"/>
    <asset:stylesheet src="bootstrap-all"/>
    <asset:javascript  src="bootstrap-all"/>

</head>

<body>
<div class="navbar-right">

</div>
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