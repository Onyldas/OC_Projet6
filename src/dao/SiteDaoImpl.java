package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import beans.Site;

public class SiteDaoImpl implements SiteDao{
    private DaoFactory daoFactory;

    SiteDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public void ajouter (Site site) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO site(nom, description, date, niveau, noteglobale, altitude, adresse, titretopo) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, site.getNom());
            preparedStatement.setString(2, site.getDescription());
            preparedStatement.setDate(3, site.getDate());
            preparedStatement.setString(4,site.getNiveau());
            preparedStatement.setInt(5,site.getNoteGlobale());
            preparedStatement.setInt(6, site.getAltitude());
            preparedStatement.setString(7, site.getAdresse());
            preparedStatement.setInt(8, site.getIdTopo());

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Site> lister(){
        List<Site> sites = new ArrayList<>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM site;");

            while (resultat.next()) {
                int id = resultat.getInt("id");
                String nom = resultat.getString("nom");
                String description = resultat.getString("description");
                Date date = resultat.getDate("date");
                String niveau = resultat.getString("niveau");
                int noteGlobale = resultat.getInt("noteglobale");
                int altitude = resultat.getInt("altitude");
                String adresse = resultat.getString("adresse");
                int idTopo = resultat.getInt("idtopo");


                Site site = new Site();
                site.setId(id);
                site.setNom(nom);
                site.setDescription(description);
                site.setDate(date);
                site.setNiveau(niveau);
                site.setNoteGlobale(noteGlobale);
                site.setAltitude(altitude);
                site.setAdresse(adresse);
                site.setIdTopo(idTopo);

                sites.add(site);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return sites;
    }
}
