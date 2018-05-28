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

         <%@ include file="includes/header.jsp" %>

        <div class="row">
            <img class="col-md-12 col-md-offset-0" src="/images/wallpaper2.jpg" alt="Let\'s climb !" />
        </div>
        <div class="row">
            <div class="col-md-12 introduction">
                <h3>Qu'est-ce qu'OC Climbing ?</h3>
                <p>Ce site internet regroupe différentes informations sur les sites d'esclade. Vous pouvez y laisser vos commentaires ou mêmes vos expériences.
                </br>N'hésitez pas non plus à passer dans la rubrique <a href="#">réservation</a> !</p>
            </div>
        </div>
        <div class = "row">
            <div class="col-md-4 boite">
                <h3><a href="/sites">Liste des différents sites</a></h3>
                <p>
                    Découvrez une liste exhaustive des différents sites/spots de plusieurs région en métropole et dans certains DOM français.
                </p>
            </div>
            <div class="col-md-4 boite">
                <h3><a href="/topos">Faire décourvrir un site</a></h3>
                <p>
                    Ici, vous pouvez voir les différents topos disponibles à l'emprunt ou leur date de disponibilité. N'hésitez pas à en emprunter un vous même grâce à un petit formulaire simple.
                </p>
            </div>
       </div>


      </div>
  </body>
</html>
