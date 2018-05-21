<%--
  Created by IntelliJ IDEA.
  User: Guillaume
  Date: 09/05/2018
  Time: 07:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connexion</title>
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.css" />" />
    <link rel="stylesheet" href="<c:url value="/css/index.css" />" />
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <c:if test="${ !empty sessionScope.pseudo }">
                <p>Vous êtes ${ sessionScope.pseudo } !</p>
            </c:if>
            <form method="post" action="/connexion">
                <p>
                    <label for="pseudo">Pseudo : </label>
                    <input type="text" name="pseudo" id="pseudo" />
                </p>
                <p>
                    <label for="motDePasse">Mot De Passe : </label>
                    <input type="password" name="motDePasse" id="motDePasse" />
                </p>

                <input type="submit" value="Envoyer"/>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            </br>
            <a href="/index"><- Retour à l'accueil</a>
        </div>
    </div>
</div>

</body>
</html>
