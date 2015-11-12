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

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>
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