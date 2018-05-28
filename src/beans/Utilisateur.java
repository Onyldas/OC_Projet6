package beans;

public class Utilisateur {



    public int id;
    public String pseudo;
    public String mail;
    public String motDePasse;
    public int age;
    public boolean pro;

    public Utilisateur(){

    }

    public Utilisateur(int id, String pseudo, String mail, String motDePasse, int age, boolean pro) {
        this.id = id;
        this.pseudo = pseudo;
        this.mail = mail;
        this.motDePasse = motDePasse;
        this.age = age;
        this.pro = pro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPro() {
        return pro;
    }

    public void setPro(boolean pro) {
        this.pro = pro;
    }


}
