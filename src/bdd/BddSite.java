package bdd;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import beans.Site;

public class BddSite {
    private Connection connexion;


    public List<Site> recupererSites() {
        List<Site> sites = new ArrayList<>();
        Statement statement = null;
        ResultSet resultat = null;

        //load the driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_climbing","postgres","hiymsw");
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT * FROM site;");

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("nom");
                String description = resultat.getString("description");
                String date = resultat.getString("date");
                String niveau = resultat.getString("niveau");
                int noteGlobale = resultat.getInt("noteglobale");
                int altitude = resultat.getInt("altitude");
                String adresse = resultat.getString("adresse");
                String titreTopo = resultat.getString("titretopo");


                Site site = new Site();
                site.setNom(nom);
                site.setDescription(description);
                site.setDate(date);
                site.setNiveau(niveau);
                site.setNoteGlobale(noteGlobale);
                site.setAltitude(altitude);
                site.setAdresse(adresse);
                site.setTitreTopo(titreTopo);

                sites.add(site);
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

        return sites;
    }
}