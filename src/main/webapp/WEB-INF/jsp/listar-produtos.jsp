<%-- 
    Document   : listar-produtos
    Created on : 30/10/2015, 19:30:20
    Author     : alexandre.hauffe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:forEach items="produto" var="produtos" >
            <h1>Produto</h1>
                <p>${produto.id}</p>
                <p>${produto.nome}</p>
                <p>${produto.quantidade}</p>
                <p>${produto.precoUnitario}</p>
        </c:forEach>
    </body>
</html>
