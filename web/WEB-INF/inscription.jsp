<%--
  Created by IntelliJ IDEA.
  User: Guillaume
  Date: 09/05/2018
  Time: 07:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des sites</title>
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.css" />"
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <h2>Inscrivez vous pour pouvoir profiter des différentes fonctionnalités de ce site web!</h2>
            <form method="post" action="/inscription">
                <p>
                    <label for="pseudo">Pseudo : </label>
                    <input type="text" name="pseudo" id="pseudo" />
                </p>
                <p>
                    <label for="mail">Email : </label>
                    <input type="email" name="mail" id="mail" />
                </p>
                <p>
                    <label for="age">Votre age : </label>
                    <input type="number" name="age" id="age" />
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
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <c:forEach var="utilisateur" items="${ utilisateurs }">
                <li><c:out value="${ utilisateur.pseudo }" /> <c:out value="${ utilisateur.mail }" /> <c:out value="${ utilisateur.age }" /></li>
            </c:forEach>
        </div>
    </div>

</div>

</body>
</html>