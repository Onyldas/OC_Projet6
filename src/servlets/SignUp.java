package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.Utilisateur;
import dao.*;

@WebServlet(name = "SignUp")
public class SignUp extends HttpServlet {

    private UtilisateurDao utilisateurDao;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setPseudo(request.getParameter("pseudo"));
        utilisateur.setMail(request.getParameter("mail"));
        utilisateur.setMotDePasse(request.getParameter("motDePasse"));
        utilisateur.setAge(Integer.parseInt(request.getParameter("age")));

        utilisateurDao.ajouter(utilisateur);

        request.setAttribute("utilisateurs", utilisateurDao.lister());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("utilisateurs", utilisateurDao.lister());
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
    }
}
