package obj;

public class Livre {
    private String titre;
    private String auteur;
    private String genre;
    private int annee;
    private int estDispo;

    
    public Livre(String titre, String auteur, String genre, int annee, int estDispo) {
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.annee = annee;
        this.estDispo = estDispo;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public int getEstDispo() {
        return estDispo;
    }
    public void setEstDispo(int estDispo) {
        this.estDispo = estDispo;
    }

    

    
}
