<%--
  Created by IntelliJ IDEA.
  User: Guillaume
  Date: 08/05/2018
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des sites</title>
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.css" />" />
    <link rel="stylesheet" href="<c:url value="/css/sites.css" />" />
</head>
<body>
    <div class="container">

        <%@ include file="includes/header.jsp" %>

        <div class="row">
            <div class="col-md-12">
                <h1>Voici la liste de tous les sites :</h1>

                <c:forEach var="sites" items="${ sites }">
                    <div class="col-md-8 col-md-offset-2 boiteSite">
                        <h2><a href="/sites/${sites.id}"><c:out value="${ sites.nom }" /></a></h2>
                        <p><c:out value="${ sites.description }"/></p>
                        <h4>Niveau : <c:out value="${ sites.niveau }"/></h4>
                    </div>
                </c:forEach>

            </div>
        </div>

    </div>

</body>
</html>
