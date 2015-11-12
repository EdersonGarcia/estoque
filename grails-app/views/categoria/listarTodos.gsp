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
</head>

<body>
<table>
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
    </tr>

    </g:each>
    </tbody>

</table>
</body>
</html>