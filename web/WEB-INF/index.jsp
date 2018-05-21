<%--
  Created by IntelliJ IDEA.
  User: Guillaume
  Date: 01/05/2018
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

  <head>
    <title>Accueil</title>
      <link rel="stylesheet" href="<c:url value="/css/bootstrap.css" />" />
      <link rel="stylesheet" href="<c:url value="/css/index.css" />" />
  </head>

  <body>
     <div class="container">
        <div class="row">
           <header class="page-header">
               <h1>Bienvenue à tous sur OC Climbing</h1>
               <div class="col-md-2">
                   <a href="#">Accueil</a>
               </div>
               <div class="col-md-2">
                   <a href="sites.jsp">Sites</a>
               </div>
               <div class="col-md-2">
                   <a href="/inscription">Inscription</a>
               </div>
               <div class="col-md-2">
                   <a href="/connexion">Connexion</a>
               </div>
           </header>
        </div>
        <div class="row">
            <img class="col-md-12 col-md-offset-0" src="/images/wallpaper2.jpg" alt="Let\'s climb !" />
        </div>
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <p>Ce site internet regroupe différentes informations sur les sites d'esclade.
                    </br>Vous pouvez y laisser vos commentaires ou mêmes vos expériences.
                    </br>N'hésite pas non plus à passer dans la rubrique <a href="#">réservation</a> !</p>
            </div>
        </div>
        <div class = "row">
            <div class="col-md-4 col-md-offset-2">
                <h2>Liste des différents sites :</h2>
                <ul>
                    <c:forEach var="sites" items="${ sites }">
                        <li><c:out value="${ sites.nom }" /></li>
                    </c:forEach>
                </ul>
            </div>
            <div class="col-md-4">
                <h2>Faire décourvrir un site</h2>
            </div>
       </div>


      </div>
  </body>
</html>
