<%--
  Created by IntelliJ IDEA.
  User: Guillaume
  Date: 28/05/2018
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <header>
        <h1>Bienvenue
            <c:choose>
            <c:when test="${ !empty sessionScope.pseudo }"> ${ sessionScope.pseudo }, </c:when>
            <c:otherwise>à tous </c:otherwise>
        </c:choose>
            sur OC Climbing</h1>
        <div class="col-md-3">
            <a href="/index">Accueil</a>
        </div>
        <div class="col-md-3">
            <a href="/sites">Sites</a>
        </div>
        <div class="col-md-3">
            <a href="/inscription">Inscription</a>
        </div>
        <div class="col-md-3">
            <a href="/connexion">Connexion</a>
        </div>
    </header>
</div>
