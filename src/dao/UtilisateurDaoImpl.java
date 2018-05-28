package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import beans.Utilisateur;

public class UtilisateurDaoImpl implements UtilisateurDao {
    private DaoFactory daoFactory;

    UtilisateurDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public void ajouter(Utilisateur utilisateur) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO utilisateur(pseudo, mail, motdepasse, age, pro) VALUES(?, ?, ?, ?, ?);");
            preparedStatement.setString(1, utilisateur.getPseudo());
            preparedStatement.setString(2, utilisateur.getMail());
            preparedStatement.setString(3, utilisateur.getMotDePasse());
            preparedStatement.setInt(4, utilisateur.getAge());
            preparedStatement.setBoolean(5,false);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Utilisateur> lister() {
        List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM utilisateur;");

            while (resultat.next()) {
                int id = resultat.getInt("id");
                String pseudo = resultat.getString("pseudo");
                String mail = resultat.getString("mail");
                String motDePasse = resultat.getString("motdepasse");
                int age = resultat.getInt("age");
                boolean pro = resultat.getBoolean("pro");

                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(id);
                utilisateur.setPseudo(pseudo);
                utilisateur.setMail(mail);
                utilisateur.setMotDePasse(motDePasse);
                utilisateur.setAge(age);
                utilisateur.setPro(pro);

                utilisateurs.add(utilisateur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }

}
