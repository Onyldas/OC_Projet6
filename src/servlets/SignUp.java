package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import bdd.BddUtilisateur;
import beans.Utilisateur;

@WebServlet(name = "SignUp")
public class SignUp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setPseudo(request.getParameter("pseudo"));
        utilisateur.setMail(request.getParameter("mail"));
        utilisateur.setMotDePasse(request.getParameter("motDePasse"));
        utilisateur.setAge(Integer.parseInt(request.getParameter("age")));

        BddUtilisateur tableUtilisateurs = new BddUtilisateur();
        tableUtilisateurs.ajouterUtilisateur(utilisateur);

        request.setAttribute("utilisateurs", tableUtilisateurs.recupererUtilisateurs());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
        BddUtilisateur tableUtilisateurs = new BddUtilisateur();
        request.setAttribute("utilisateurs", tableUtilisateurs.recupererUtilisateurs());
    }
}
