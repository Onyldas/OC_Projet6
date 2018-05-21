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
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <h2>Voici la liste de tous les sites :</h2>
                <ul>
                    <c:forEach var="sites" items="${ sites }">
                        <li><c:out value="${ sites.nom }" /></li>
                    </c:forEach>
                </ul>
            </div>
        </div>

    </div>

</body>
</html>
