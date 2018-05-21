package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import beans.Utilisateur;
public class BddUtilisateur {

    private Connection connexion;

    public List<Utilisateur> recupererUtilisateurs() {
        List<Utilisateur> utilisateurs = new ArrayList<>();
        Statement statement = null;
        ResultSet resultat = null;

        loadDatabase();

        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT * FROM utilisateur;");

            // Récupération des données
            while (resultat.next()) {
                String pseudo = resultat.getString("pseudo");
                String mail = resultat.getString("mail");
                String motDePasse = resultat.getString("motdepasse");
                int age = resultat.getInt("age");
                boolean pro = resultat.getBoolean("pro");

                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setPseudo(pseudo);
                utilisateur.setMail(mail);
                utilisateur.setMotDePasse(motDePasse);
                utilisateur.setAge(age);
                utilisateur.setPro(pro);

                utilisateurs.add(utilisateur);
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }

        return utilisateurs;
    }

    private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_climbing","postgres","hiymsw");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        loadDatabase();

        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO utilisateur(pseudo, mail, motdepasse, age, pro) VALUES(?, ?, ?, ?, ?);");
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
}
