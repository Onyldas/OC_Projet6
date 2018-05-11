package beans;

public class Site {

    public String nom;
    public String description;
    public String date;
    public String niveau;
    public int noteGlobale;
    public int altitude;
    public String adresse;
    public String titreTopo;

    public Site(){

    }

    public Site(String nom, String description, String date, String niveau, int noteGlobale, int altitude, String adresse, String titreTopo) {
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.niveau = niveau;
        this.noteGlobale = noteGlobale;
        this.altitude = altitude;
        this.adresse = adresse;
        this.titreTopo = titreTopo;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
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

    public String getTitreTopo() {
        return titreTopo;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
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

    public void setTitreTopo(String titreTopo) {
        this.titreTopo = titreTopo;
    }
}
