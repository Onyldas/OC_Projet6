package beans;

import java.sql.Date;

public class Site {

    public int id;
    public String nom;
    public String description;
    public Date date;
    public String niveau;
    public int noteGlobale;
    public int altitude;
    public String adresse;
    public int idTopo;

    public Site(){

    }

    public Site(int id, String nom, String description, Date date, String niveau, int noteGlobale, int altitude, String adresse, int idTopo) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.niveau = niveau;
        this.noteGlobale = noteGlobale;
        this.altitude = altitude;
        this.adresse = adresse;
        this.idTopo = idTopo;
    }

    public int getId(){return id;}

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String getNiveau() {
        return niveau;
    }

    public int getNoteGlobale() {
        return noteGlobale;
    }

    public int getAltitude() {
        return altitude;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getIdTopo() {
        return idTopo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setNoteGlobale(int noteGlobale) {
        this.noteGlobale = noteGlobale;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setIdTopo(int titreTopo) {
        this.idTopo = titreTopo;
    }
}
